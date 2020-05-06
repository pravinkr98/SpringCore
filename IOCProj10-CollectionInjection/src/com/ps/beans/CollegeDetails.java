package com.ps.beans;

import java.util.Date;
import java.util.List;

public class CollegeDetails {
	private List<String> studentNames;
	private List<Date> impDates;
	
	public CollegeDetails() {
		System.out.println("CollegeDetails::0-param constructor<List>");
	}
	
	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}
	public void setImpDates(List<Date> impDates) {
		this.impDates = impDates;
	}
	@Override
	public String toString() {
		return "CollegeDetails [studentNames=" + studentNames + ", impDates=" + impDates + "]";
	}
	
}
