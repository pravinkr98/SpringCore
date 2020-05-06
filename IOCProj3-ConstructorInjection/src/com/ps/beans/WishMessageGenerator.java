package com.ps.beans;

import java.util.Date;

public class WishMessageGenerator {
private Date date; //Bean property
	
	public WishMessageGenerator(Date date) {
		this.date=date;
	}
	//Business method
	public String generateWishMessage(String name) {
		int hour=0;
		hour=date.getHours(); //get current hour of day
		if(hour<12)
			return "Good Morning :: "+name;
		else if(hour<16)
			return "Good Afternoon :: "+name;
		else if(hour<20)
			return "Good Evening :: "+name;
		else 
			return "Good Night :: "+name;
	}
}
