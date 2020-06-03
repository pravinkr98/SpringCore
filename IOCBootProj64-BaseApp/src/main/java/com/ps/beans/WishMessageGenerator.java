package com.ps.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wish")
public class WishMessageGenerator {
	
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator :: 0-param constructor"); 
	}

	@Autowired
	private Calendar cal;
	
	public String getWishMessage(String user) {
		int hour=0;
		//get time
		hour=cal.get(Calendar.HOUR_OF_DAY);
		//write b.logic
		if(hour<12)
			return "Good Morning :: "+user;
		else if(hour<16)
			return "Good Afternoon :: "+user;
		else if(hour<20)
			return "Good Afternoon :: "+user;
		else
			return "Good Night :: "+user;
	}
}
