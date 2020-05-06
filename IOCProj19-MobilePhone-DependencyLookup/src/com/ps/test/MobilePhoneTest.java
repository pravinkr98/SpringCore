package com.ps.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ps.beans.MobilePhone;

public class MobilePhoneTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MobilePhone phone=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ps/cfgs/applicationContext.xml");
		//get Bean class object
		phone=factory.getBean("phone", MobilePhone.class);
		//invoke method
		phone.gaming();
		phone.entertainment();
		phone.batteryCharging();
		phone.calls();
		phone.shopping();

	}

}
