package com.ps.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dfb")
public final class DateFactoryBean implements FactoryBean<Date> {
	@Value("2020")
	private int year;
	@Value("5")
	private int month;
	@Value("17")
	private int day;
	
	public DateFactoryBean() {
		System.out.println("DateFactoryBean:: 0-param constructor");
	}

	@Override
	public Date getObject() throws Exception {
		System.out.println("DateFactoryBean.getObject()");
		return new Date((year-1900),month-1,day);
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("DateFactoryBean.getObjectType()");
		return Date.class;
	}
	
	@Override
	public boolean isSingleton() {
		System.out.println("DateFactoryBean.isSingleton()");
		return true;
	}

}
