package com.ps.config;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ps.beans")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig :: 0-param constructor");
	}
	
	@Bean
	public Calendar createCalendar() {
		Calendar cal=Calendar.getInstance();
		//return calendar instance
		return cal;
	}

}
