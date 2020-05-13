package com.ps.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobilePhone {
	private String beanId;
	
	public MobilePhone() {
			System.out.println("MobilePhone.:: 0-param constructor");
	}
			
	public void setBeanId(String beanId) {
		System.out.println("MobilePhone.setBeanId()");
		this.beanId = beanId;
	}
	
	public void entertainment() {
		System.out.println("Gives entertainment using Apps like prime video,netflix,browser and...");
	}
	
	public void gaming() {
		System.out.println("Gives Gaming feeling using PubG, ludo king, free fire and etc...apps");
	}
	
	public void batteryCharging() {
		ApplicationContext ctx=null;
		MobilePhoneBatteryCharger charger=null;
		
		System.out.println("MobilePhone.batteryCharging()");
		System.out.println("2nd IOC container");
		// geting IOC container
		ctx=new ClassPathXmlApplicationContext("com/ps/cfgs/applicationContext.xml");
		//get Dependent class object
		charger=ctx.getBean(beanId,MobilePhoneBatteryCharger.class);
		charger.charging();
	}

	public void calls() {
		System.out.println("Handling both incoming and outgoing calls");
	}

	public void shopping() {
		System.out.println("Online shopping using amazon,flipkart and etc...apps");
	}

}
