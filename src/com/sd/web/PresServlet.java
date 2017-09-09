package com.sd.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PresServlet extends HttpServlet {
	private PresidentDAO presidentDAO;
	static int presNum;
	
	@Override
	public void init() throws ServletException {
		presidentDAO = new PresidentFileDAO(getServletContext());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("presidents", presidentDAO.getPresList());
		req.setAttribute("currentPres", presidentDAO.getPresList().get(0));
		req.getRequestDispatcher("/home.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String next =req.getParameter("next");
		String submit = req.getParameter("submit");
		int num = 1;
		if(req.getParameter("Number") != null) {
			num = Integer.parseInt(req.getParameter("Number"));
		}
		if(next != null && next.equals("Next")) {
		if (presNum <= presidentDAO.getPresList().size() - 1) {
			presNum++;
		}
		}
		if(next != null && next.equals("Previous"))
		if (presNum != 0) {
			presNum--;
		}
		if(submit != null && submit.equals("Submit")) {
			presNum = num - 1;
		}
		req.setAttribute("currentPres", presidentDAO.getPresList().get(presNum));
		req.setAttribute("numPres", presidentDAO.getPresList().size());
		req.getRequestDispatcher("/home.jsp").forward(req, resp);
	}

}