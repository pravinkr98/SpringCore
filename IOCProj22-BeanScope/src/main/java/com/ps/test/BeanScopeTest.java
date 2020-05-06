package com.ps.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ps.beans.PersonProfile;
import com.ps.beans.Printer;

public class BeanScopeTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		PersonProfile profile1=null,profile2=null;
		Printer p1=null,p2=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ps/cfgs/applicationContext.xml");
		
		//get Bean
		profile1=factory.getBean("rajaProfile", PersonProfile.class);
		System.out.println(profile1);
		System.out.println("...........................");
		
		profile2=factory.getBean("rajaProfile", PersonProfile.class);
		System.out.println(profile2);
		System.out.println(".............................");
		
		System.out.println(profile1.hashCode()+"  "+profile2.hashCode());
		System.out.println(".............................");
		
		//get object
	//	p1=Printer.getInstance();
	//	p2=Printer.getInstance();
		
		/*p1=factory.getBean("pt", Printer.class);
		p2=factory.getBean("pt", Printer.class);*/
		
		p1=factory.getBean("pt", Printer.class);
		p2=factory.getBean("pt1", Printer.class);
		
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println("...............................");
		System.out.println(p1.hashCode()+" "+p2.hashCode());

	}

}
