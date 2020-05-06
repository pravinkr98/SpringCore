package com.ps.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ps.beans.A;
import com.ps.beans.B;

public class ClientApp {

	public static void main(String[] args) {
		BeanFactory factory=null;
		A a1=null;
		B b1=null;
		factory=new XmlBeanFactory(new ClassPathResource("com/ps/cfgs/applicationContext.xml"));
		a1=factory.getBean("a1",A.class);
		//b1=factory.getBean("b1",B.class);
	}

}
