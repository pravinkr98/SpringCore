package com.ps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ps.beans.WebContainer;

@SpringBootApplication
public class IocBootProj65LmiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WebContainer container=null;
		
		//get IOC container
		ctx=SpringApplication.run(IocBootProj65LmiApplication.class, args);
		//get bean object
		container=ctx.getBean("container", WebContainer.class);
		//invoke methods
		container.processRequest("Ameerpet");
		container.processRequest("Charminar");
		
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}

}
