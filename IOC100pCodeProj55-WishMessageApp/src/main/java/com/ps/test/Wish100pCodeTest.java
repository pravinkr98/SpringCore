package com.ps.test;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ps.beans.WishMessageGenerator;
import com.ps.config.AppConfig;

public class Wish100pCodeTest {

	public static void main(String[] args) {
		WishMessageGenerator generator=null;
		ApplicationContext ctx=null;
		
		//get IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("...........................................");
		//get WishMessageGenerator object
		generator=ctx.getBean("wmg", WishMessageGenerator.class);
		System.out.println("..............................................");
		//invoke method
		System.out.println(generator.generateWishMessage("raja"));
		System.out.println("........................................................................");
		System.out.println(ctx.getBean("cal", Calendar.class));
	}

}
