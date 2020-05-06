package com.ps.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ps.beans.Votar;

public class DeclarativeBeanLifecycleTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Votar votar=null;
		String eligible=null;
		
		//Create IOC container
		ctx=new ClassPathXmlApplicationContext("com/ps/cfgs/applicationContext.xml");
		//get bean from bean cfgs
		votar=ctx.getBean("votElg", Votar.class);
		System.out.println(votar);
		//check voting eligibility
		eligible=votar.checkVotingEligibility();
		System.out.println(eligible);
		
		//close IOC container
		((AbstractApplicationContext) ctx).close();
	}

}
