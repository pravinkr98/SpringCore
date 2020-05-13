package com.ps.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class WebContainer {

	public abstract RequestHandler getHandler();
	
	public void processRequest(String data) {
		RequestHandler rh;
		System.out.println("WebContainer received request having data :: "+data +" for processing--> "+this.hashCode());
		//perform  loolup method injection for dependent bean object
		rh=getHandler();
		//use Dependent bean
		rh.handler(data);
	}

	

}
