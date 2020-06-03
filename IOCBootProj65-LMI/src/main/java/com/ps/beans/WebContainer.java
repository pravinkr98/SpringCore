package com.ps.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("container")
public abstract class WebContainer {

	@Lookup
	public abstract RequestHandler getHandler();
	
	public void processRequest(String data) {
		RequestHandler rh;
		System.out.println("WebContainer received request having data :: "+data +" for processing--> "+this.hashCode());
		//perform  lookup method injection for dependent bean object
		rh=getHandler();
		//use Dependent bean
		rh.handler(data);
	}

	

}
