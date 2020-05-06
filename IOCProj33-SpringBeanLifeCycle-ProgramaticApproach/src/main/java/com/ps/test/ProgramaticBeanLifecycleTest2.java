package com.ps.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ps.beans.Votar;

public class ProgramaticBeanLifecycleTest2 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Votar votar=null,votar1=null;
		String eligible=null,eligible1=null;
		
		//Create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ps/cfgs/applicationContext.xml");
		
		//get bean from bean cfgs
		votar=factory.getBean("votElg", Votar.class);
		System.out.println(votar);
		//check voting eligibility
		eligible=votar.checkVotingEligibility();
		System.out.println(eligible);
		
		//get bean from bean cfgs
		votar1=factory.getBean("votElg1", Votar.class);
		System.out.println(votar1);
		//check voting eligibility
		eligible1=votar1.checkVotingEligibility();
		System.out.println(eligible1);
		
		
	}

}
