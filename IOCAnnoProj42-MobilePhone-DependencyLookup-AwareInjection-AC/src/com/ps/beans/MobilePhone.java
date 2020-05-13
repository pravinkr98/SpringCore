package com.ps.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("phone")
@PropertySource(value = "com/ps/commons/info.properties")
public class MobilePhone implements ApplicationContextAware {
	
	@Value("${phone.beanId}")
	private String beanId;
	
	private ApplicationContext ctx;
	
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
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("MobilePhone.setApplicationContext():: override method");
		this.ctx=ctx;		
	}
	
	public void batteryCharging() {
		MobilePhoneBatteryCharger charger=null;
		
		System.out.println("MobilePhone.batteryCharging()");
		System.out.println("2nd IOC container");
	
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
