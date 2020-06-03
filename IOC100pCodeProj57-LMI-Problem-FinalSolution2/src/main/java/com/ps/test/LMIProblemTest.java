package com.ps.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ps.beans.WebContainer;
import com.ps.config.AppConfig;

public class LMIProblemTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WebContainer container=null;
		
		//create ApplicationContext container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Target Bean class object
		container=ctx.getBean("container",WebContainer.class);
		
		System.out.println(container.getClass()+"       "+container.getClass().getSuperclass());
		
		//invoke methods
		container.processRequest("corona patient");
		System.out.println("===========================");
		container.processRequest("corona treatement");
		System.out.println("============================");
		container.processRequest("corona hospital");
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("-------------------------------------------------------------------------------");
		
		//get Target Bean class object
		container=ctx.getBean("container",WebContainer.class);
		
		//invoke methods
		container.processRequest("corona patient");
		System.out.println("===========================");
		container.processRequest("corona treatement");
		System.out.println("============================");
		container.processRequest("corona hospital");
		
		//close container
		((AbstractApplicationContext) ctx).close();
		

	}

}
