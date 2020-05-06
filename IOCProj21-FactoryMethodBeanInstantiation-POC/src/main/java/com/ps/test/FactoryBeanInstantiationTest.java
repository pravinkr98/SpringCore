package com.ps.test;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryBeanInstantiationTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Class clazz=null;
		Calendar cal=null;
		String s1=null,s2=null;
		StringBuffer sb=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ps/cfgs/applicationContext.xml");
		//get Target bean class object
		clazz=factory.getBean("c1", Class.class);
		System.out.println("clazz obj class name:: "+clazz.getClass()+" data:: "+clazz.toString());
		System.out.println("..........................");
		cal=factory.getBean("cal", Calendar.class);
		System.out.println("cal obj class name:: "+cal.getClass()+" data::" +cal.toString());
		s1=factory.getBean("s1", String.class);
		System.out.println("String obj class name:: "+s1.getClass()+" data:: "+s1.toString());
		System.out.println("..........................");
		s2=factory.getBean("s2", String.class);
		System.out.println("String obj class name:: "+s2.getClass()+" data:: "+s2.toString());	
		System.out.println("..........................");
		sb=factory.getBean("sb", StringBuffer.class);
		System.out.println("StringBuffer obj class name:: "+sb.getClass()+" data:: "+sb.toString());	

	}

}
