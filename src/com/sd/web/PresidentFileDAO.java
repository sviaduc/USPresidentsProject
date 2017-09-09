package com.sd.web;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;

import com.sd.data.President;

public class PresidentFileDAO implements PresidentDAO {
	private static final String filename = "WEB-INF/presidents.csv";
//	private static final String filename = "WEB-INF/Simple.csv";
    private ServletContext servletContext;
    private List<President> presList;
    
	public PresidentFileDAO(ServletContext context) {
		servletContext = context;
		presList = new ArrayList<>();
		loadPresidentsFromFile();
	}

	private void loadPresidentsFromFile() {
		System.out.println("Loading");
        // Retrieve an input stream from the servlet context
        // rather than directly from the file system
        InputStream is = servletContext.getResourceAsStream(filename);
        try (BufferedReader buf = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = buf.readLine()) != null) {
            	String[] col = line.split(", ");

				String term = col[0];
				String fName = col[1];
				String mName = col[2];
				String lName = col[3];

				String termBeginStr = col[4];// Date term began.
				String termEndStr = col[5]; // Date term ended.

				String party = col[6];

				President pres = new President(term, termBeginStr, termEndStr, fName, mName, lName, party);
				presList.add(pres);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

	@Override
	public String getTermNum(President p) {
		return p.getTermNum();
		
	}

	@Override
	public String getStartYear(President p) {
		return p.getStartYear();
		
	}

	@Override
	public String getEndYear(President p) {
		return p.getEndYear();
		
	}

	@Override
	public String getFName(President p) {
		return p.getfName();
		
	}

	@Override
	public String getMidName(President p) {
		return p.getMidName();
		
	}

	@Override
	public String getLName(President p) {
		return p.getlName();
		
	}

	@Override
	public String getParty(President p) {
		return p.getParty();
		
	}

	@Override
	public List<President> getPresList() {
		return presList;
	}
}
