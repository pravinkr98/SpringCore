package com.ps.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.ps.config.AppConfig;

@Component("phone")
public class MobilePhone {
	
	/*	@Qualifier("charger")
		private String beanId;*/
			
	public void entertainment() {
		System.out.println("Gives entertainment using Apps like prime video,netflix,browser and...");
	}
	public void gaming() {
		System.out.println("Gives Gaming feeling using PubG, ludo king, free fire and etc...apps");
	}
	public void batteryCharging() {
		ApplicationContext ctx=null;
		MobilePhoneBatteryCharger charger=null;
		// geting IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Dependent class object
		charger=ctx.getBean("charger",MobilePhoneBatteryCharger.class);
		charger.charging();
	}
	public void calls() {
		System.out.println("Handling both incoming and outgoing calls");
	}
	public void shopping() {
		System.out.println("Online shopping using amazon,flipkart and etc...apps");
	}

}
