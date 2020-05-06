package com.ps.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ps.beans.PersonProfile;

public class NullInjectionTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		PersonProfile profile1=null,profile2=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ps/cfgs/applicationContext.xml");
		
		//get Bean
		profile1=factory.getBean("rajaProfile", PersonProfile.class);
		System.out.println(profile1);
		System.out.println("...........................");
		
		profile2=factory.getBean("raniProfile", PersonProfile.class);
		System.out.println(profile2);
		System.out.println(".............................");

	}

}
