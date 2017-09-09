package com.sd.data;

public class President {
	private String termNum, startYear, endYear;
	private String fName, midName, lName, party;

	public President() {
	}

	public President(String termNum, String startYear, String endYear, String fName, String midName, String lName,
			String party) {
		super();
		this.termNum = termNum;
		this.startYear = startYear;
		this.endYear = endYear;
		this.fName = fName;
		this.midName = midName;
		this.lName = lName;
		this.party = party;
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