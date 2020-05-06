package com.ps.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.ps.beans.Flipkart;

public class LCTestApp {

	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null;
		//Locate Spring Bean configuration file
		res=new FileSystemResource("src/com/ps/cfgs/applicationContext.xml");
		//Create BeanFactory obj to create IOC container
		factory=new XmlBeanFactory(res);
		//Get Bean obj
		Flipkart bean=factory.getBean("fpk",Flipkart.class);
		String billmsg=bean.purchase(new String[] {"shirt","mobile","books"});
		System.out.println(billmsg);
	}//main
}//class
