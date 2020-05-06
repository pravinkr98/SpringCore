package com.ps.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class MobilePhone {
	private String beanId;
			
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	public void entertainment() {
		System.out.println("Gives entertainment using Apps like prime video,netflix,browser and...");
	}
	public void gaming() {
		System.out.println("Gives Gaming feeling using PubG, ludo king, free fire and etc...apps");
	}
	public void batteryCharging() {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MobilePhoneBatteryCharger charger=null;
		// geting IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ps/cfgs/applicationContext.xml");
		//get Dependent class object
		charger=factory.getBean("charger",MobilePhoneBatteryCharger.class);
		charger.charging();
	}
	public void calls() {
		System.out.println("Handling both incoming and outgoing calls");
	}
	public void shopping() {
		System.out.println("Online shopping using amazon,flipkart and etc...apps");
	}

}
