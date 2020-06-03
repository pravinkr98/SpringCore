package com.ps;

import java.io.PrintStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ps.beans.WishMessageGenerator;

@SpringBootApplication
public class IocBootProj64BaseAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessageGenerator generator=null;
		String msg=null;
		
		System.out.println("IocBootProj64BaseAppApplication.main()");
		//create IOC container
		ctx=SpringApplication.run(IocBootProj64BaseAppApplication.class, args);
		//get target bean class object
		generator=ctx.getBean("wish", WishMessageGenerator.class);
		//invoke b.method
		msg=generator.getWishMessage("Guddu");
		//display message
		System.out.println("Wish message is --> "+msg);
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}

}
