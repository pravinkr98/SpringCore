package com.ps.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ps.beans.Vehicle;

public class JavaConfigAnnotationTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Vehicle vehicle=null;
		
		//get IOC container
		ctx=new ClassPathXmlApplicationContext("com/ps/cfgs/applicationContext.xml");
		//get bean
		vehicle=ctx.getBean("vehicle", Vehicle.class);
		//invoke method
		vehicle.journey("hyd", "goa");
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
