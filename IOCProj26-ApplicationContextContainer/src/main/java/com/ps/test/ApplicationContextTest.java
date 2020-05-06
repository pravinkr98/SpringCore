package com.ps.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ps.beans.PersonProfile;

public class ApplicationContextTest {

	public static void main(String[] args) {
		PersonProfile profile1=null,profile2=null;
		ApplicationContext ctx=null;
		
		//create IOC container of type "AC"
		//ctx=new FileSystemXmlApplicationContext("src/main/java/com/ps/cfgs/applicationContext.xml");
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get Bean
	    profile1=ctx.getBean("rajaProfile", PersonProfile.class);
		System.out.println(profile1);
		System.out.println("...........................");
		
		profile2=ctx.getBean("raniProfile", PersonProfile.class);
		System.out.println(profile2);
		System.out.println(".............................");
		
		((AbstractApplicationContext)ctx).close();

	}

}
