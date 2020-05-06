package com.ps.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ps.beans.PersonProfile;

public class RequiredAnnoTest2 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		PersonProfile p1=null;
		
		//Create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ps/cfgs/applicationContext.xml");
		//get bean
		p1=factory.getBean("person", PersonProfile.class);		
		System.out.println(p1);
	
	}//main

}//class
