package com.ps.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ps.beans.EnggCourse;

public class EnggCourseTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		EnggCourse engCourse=null,engCourse1=null,engCourse2=null,engCourse3=null;
		
		//get Bean factory IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/ps/cfgs/applicationContext.xml"));
		engCourse=factory.getBean("efyEngg", EnggCourse.class);
		System.out.println(engCourse);
		System.out.println(".......................");
		
		engCourse1=factory.getBean("csfyEngg", EnggCourse.class);
		System.out.println(engCourse1);
		System.out.println(".......................");
		
		engCourse2=factory.getBean("mhfyEngg", EnggCourse.class);
		System.out.println(engCourse2);
		System.out.println(".......................");
		
		engCourse3=factory.getBean("cvfyEngg", EnggCourse.class);
		System.out.println(engCourse3);
		System.out.println(".......................");

	}

}
