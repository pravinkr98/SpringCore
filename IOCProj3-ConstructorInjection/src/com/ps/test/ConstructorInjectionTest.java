package com.ps.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.ps.beans.WishMessageGenerator;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator generator=null;
		//Hold Spring Bean cfg file
		res=new FileSystemResource("src/com/ps/cfgs/applicationContext.xml");
		//create Bean Factory IOC container
		factory=new XmlBeanFactory(res);
		//get Target Bean class object
		Object obj=factory.getBean("wmg");
		//type casting
		generator=(WishMessageGenerator)obj;
		//invoke business method
		System.out.println("Result is :: "+generator.generateWishMessage("Nataraz Sir,"));
	}//main
}//class
