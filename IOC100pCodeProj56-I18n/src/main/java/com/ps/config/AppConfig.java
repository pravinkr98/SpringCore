package com.ps.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	
	@Bean("messageSource")
	public ResourceBundleMessageSource createRBMS() {
		ResourceBundleMessageSource rbms=null;
		//create object
		rbms=new ResourceBundleMessageSource();
		rbms.addBasenames("com/ps/commons/App");
		//return object
		return rbms;
	}
}
