package com.ps.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ps.beans.BankService;

public class MethodReplacerTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService service=null;
		
		// create IOC container
		ctx=new ClassPathXmlApplicationContext("com/ps/cfgs/applicationContext.xml");
		//get Spring bean class object
		service=ctx.getBean("bank",BankService.class);
		System.out.println(service.getClass()+"---->"+service.getClass().getSuperclass());
		//invoke the method
		System.out.println("Interest amount is :: "+service.calcInterestAmount(100000, 12));
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
