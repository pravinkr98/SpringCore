package com.ps.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ps.beans")
public class AppConfig {

	@Bean("cal")
	public Calendar createCalendar() {
		Calendar calendar=null;
		//get calendar object
		calendar=Calendar.getInstance();
		//return object
		return calendar;
	}
}
