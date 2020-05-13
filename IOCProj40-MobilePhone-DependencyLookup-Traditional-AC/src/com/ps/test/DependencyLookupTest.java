package com.ps.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ps.beans.MobilePhone;

public class DependencyLookupTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		MobilePhone phone=null;
		System.out.println("1st IOC container");
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/ps/cfgs/applicationContext.xml");
		//get Bean class object
		phone=ctx.getBean("phone", MobilePhone.class);
		System.out.println("..............................................");
		//invoke method
		phone.batteryCharging();
		
		System.out.println("..................other features.......");
		phone.gaming();
		phone.entertainment();		
		phone.calls();
		phone.shopping();

	}

}
