package com.ps.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ps.beans.PersonProfile;

public class RequiredAnnoTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		PersonProfile p1=null;
		
		//Create IOC container
		ctx=new ClassPathXmlApplicationContext("com/ps/cfgs/applicationContext.xml");
		//get bean
		p1=ctx.getBean("person", PersonProfile.class);		
		System.out.println(p1);
		
		//close stream
		((AbstractApplicationContext) ctx).close();

	}//main

}//class
