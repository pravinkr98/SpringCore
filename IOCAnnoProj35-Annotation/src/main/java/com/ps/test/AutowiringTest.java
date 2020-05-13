package com.ps.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ps.beans.Student;

public class AutowiringTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Student st=null;
		
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/ps/cfgs/applicationContext.xml");
		//get Bean
		st=ctx.getBean("stud", Student.class);
		System.out.println(st);
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
