package com.ps.beans;

import java.util.Date;
import java.util.List;

public class StudentDetails {
	private List<Integer> marks;
	private List<Date> impDates;
	
	public StudentDetails() {
		System.out.println("StudentDetails::0-param constructor<List>");
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public void setImpDates(List<Date> impDates) {
		this.impDates = impDates;
	}

	@Override
	public String toString() {
		return "StudentDetails [marks=" + marks + ", impDates=" + impDates + "]";
	}
	
	
	
	
	
	
}
