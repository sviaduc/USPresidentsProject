package com.sd.web;

import java.time.LocalDate;
import java.util.List;

import com.sd.data.President;

public interface PresidentDAO {
	public String getTermNum(President p);
	public String getStartYear(President p);
	public String getEndYear(President p);
	public String getFName(President p);
	public String getMidName(President p);
	public String getLName(President p);
	public String getParty(President p);
	public String getImage(President p);
	public String getFact(President p);
	public List<President> getPresList();
}
