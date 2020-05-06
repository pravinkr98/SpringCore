package com.ps.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ps.beans.Course;
import com.ps.beans.Marks;
import com.ps.beans.Student;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Student st=null;
		Marks mk=null;
		Course crs=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/ps/cfgs/applicationContext.xml"));
		//get Spring Bean class object
		st=factory.getBean("st",Student.class);
		System.out.println(st);
		System.out.println(".....................................................");
		mk=factory.getBean("mk",Marks.class);
		System.out.println(mk);
		System.out.println(".....................................................");
		crs=factory.getBean("crs",Course.class);
		System.out.println(crs);
	}

}
