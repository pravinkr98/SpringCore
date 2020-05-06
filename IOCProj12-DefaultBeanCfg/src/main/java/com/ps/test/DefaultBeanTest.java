package com.ps.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ps.beans.Car;

public class DefaultBeanTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Car car1=null,car2=null;
		
		//create bean factory
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ps/cfgs/applicationContext.xml");
		
		//get Spring bean class object
		car1=factory.getBean("com.ps.beans.Car",Car.class);
		System.out.println(car1);
		System.out.println(".................................");
		
		car2=factory.getBean("com.ps.beans.Car#1",Car.class);
		System.out.println(car2);

	}

}
