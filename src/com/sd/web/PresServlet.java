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
		String next =req.getParameter("Next");
		
		if (presNum <= presidentDAO.getPresList().size() - 2) {
			presNum++;
		}
		req.setAttribute("currentPres", presidentDAO.getPresList().get(presNum));
		req.setAttribute("numPres", presidentDAO.getPresList().size());
		req.getRequestDispatcher("/home.jsp").forward(req, resp);
	}

}
