package com.ps.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer {
	private String beanId;
	
	public WebContainer(String beanId) {
		System.out.println("WebContainer:: 1-param constructor");
		this.beanId=beanId;
	}
	
	public void processRequest(String data) {
		RequestHandler rh;
		ApplicationContext ctx=null;
		System.out.println("WebContainer received request having data :: "+data +" for processing--> "+this.hashCode());
		//Extra container for dependency loolup
		ctx=new ClassPathXmlApplicationContext("com/ps/cfgs/applicationContext.xml");
		//perform dependency loolup for dependent bean object
		rh=ctx.getBean(beanId,RequestHandler.class);
		rh.handler(data);
	}

}
