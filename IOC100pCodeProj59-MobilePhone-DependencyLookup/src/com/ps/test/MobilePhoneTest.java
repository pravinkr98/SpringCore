package com.ps.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ps.beans.MobilePhone;
import com.ps.config.AppConfig;

public class MobilePhoneTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		MobilePhone phone=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Bean class object
		phone=ctx.getBean("phone", MobilePhone.class);
		//invoke method
		phone.gaming();
		phone.entertainment();
		phone.batteryCharging();
		phone.calls();
		phone.shopping();
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
