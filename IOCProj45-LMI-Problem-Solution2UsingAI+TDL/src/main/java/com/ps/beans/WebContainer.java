package com.ps.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer implements ApplicationContextAware {
	private String beanId;
	private ApplicationContext ctx=null;
	
	public WebContainer(String beanId) {
		System.out.println("WebContainer:: 1-param constructor");
		this.beanId=beanId;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("WebContainer.setApplicationContext()");
		this.ctx=ctx;
		
	}
	
	public void processRequest(String data) {
		RequestHandler rh;
		System.out.println("WebContainer received request having data :: "+data +" for processing--> "+this.hashCode());
		//perform dependency loolup for dependent bean object
		rh=ctx.getBean(beanId,RequestHandler.class);
		rh.handler(data);
	}

	

}
