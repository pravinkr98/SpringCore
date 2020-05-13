package com.ps.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ps.beans.PersonProfile;

public class NullInjectionTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		PersonProfile profile1=null,profile2=null;
		
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/ps/cfgs/applicationContext.xml");	
		//get Bean
		profile1=ctx.getBean("rajaProfile", PersonProfile.class);
		System.out.println(profile1);
		System.out.println("...........................");
		
		profile2=ctx.getBean("raniProfile", PersonProfile.class);
		System.out.println(profile2);
		System.out.println(".............................");

	}

}
