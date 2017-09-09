package com.sd.data;

import java.time.LocalDate;

public class President {
	private String termNum;
	private String startYear;
	private String endYear;
	private String fName;
	private String midName;
	private String lName;
	private String party;
	private String image;
	private String fact;

	public President() {
	}

	public President(String termNum, String startYear, String endYear, String fName, String midName, String lName,
			String party, String image, String fact) {
		super();
		this.termNum = termNum;
		this.startYear = startYear;
		this.endYear = endYear;
		this.fName = fName;
		this.midName = midName;
		this.lName = lName;
		this.party = party;
		this.image = image;
		this.fact = fact;
	}


	public String getTermNum() {
		return termNum;
	}

	public void setTermNum(String termNum) {
		this.termNum = termNum;
	}

	public String getStartYear() {
		return startYear;
	}

	public void setStartYear(String startYear) {
		this.startYear = startYear;
	}

	public String getEndYear() {
		return endYear;
	}

	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getMidName() {
		return midName;
	}

	public void setMidName(String midName) {
		this.midName = midName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getFact() {
		return fact;
	}

	public void setFact(String fact) {
		this.fact = fact;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" #");
		builder.append(termNum);
		builder.append(" ");
		builder.append(fName);
		builder.append(" ");
		builder.append(midName);
		builder.append(" ");
		builder.append(lName);
		builder.append("\n     President from ");
		builder.append(startYear);
		builder.append(" - ");
		builder.append(endYear);
		builder.append("\n     ");
		builder.append(party);
		builder.append("\n");
		return builder.toString();
	}

}