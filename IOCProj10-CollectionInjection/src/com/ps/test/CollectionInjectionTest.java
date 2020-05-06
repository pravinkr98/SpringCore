package com.ps.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ps.beans.CollegeDetails;
import com.ps.beans.FruitsStore;
import com.ps.beans.MinistryOfHR;
import com.ps.beans.PersonProfile;
import com.ps.beans.StudentDetails;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		StudentDetails st=null;
		CollegeDetails details=null;
		MinistryOfHR hr=null;
		FruitsStore frs=null;
		PersonProfile prf=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/ps/cfgs/applicationContext.xml"));
		//get Bean
		st=factory.getBean("stDetails",StudentDetails.class);
		System.out.println(st);
		System.out.println("..........................");
		details=factory.getBean("clgDetails", CollegeDetails.class);
		System.out.println(details);
		System.out.println("..........................");
		hr=factory.getBean("moh",MinistryOfHR.class);
		System.out.println(hr);
		System.out.println("............................");
		frs=factory.getBean("fs",FruitsStore.class);
		System.out.println(frs);
		System.out.println("...............................");
		prf=factory.getBean("profile",PersonProfile.class);
		System.out.println(prf);
		

	}

}
