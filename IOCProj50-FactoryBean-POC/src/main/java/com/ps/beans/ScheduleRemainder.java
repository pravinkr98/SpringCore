package com.ps.beans;

import java.util.Date;

public class ScheduleRemainder {
	private Date date;
	
	public ScheduleRemainder(Date date) {
		System.out.println("ScheduleRemainder.ScheduleRemainder()");
		this.date=date;
	}
	
	public String remainderOfTheDay() {
		Date sysDate=null;
		sysDate=new Date();
		if(sysDate.getYear()==date.getYear()&&sysDate.getMonth()==date.getMonth()&&sysDate.getDay()==date.getDay())
			return "U have an appoinment today... call the manager for the details";
		else
			return "U do not have any appoinment today ... just relax and chill";
				
	}

}
