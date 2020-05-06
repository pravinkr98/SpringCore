package com.ps.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ps.controller.CustomerController;
import com.ps.vo.CustomerVO;

public class CustomerRegistrationTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Scanner sc=null;
		String cid,cname,cadd,contact;
		CustomerVO vo=null;
		CustomerController custController=null;
		String result=null;
		
		//create bean factory container
		factory=new XmlBeanFactory(new ClassPathResource("com/ps/cfgs/applicationContext.xml"));
		sc=new Scanner(System.in);
		System.out.println("Enter customer id :: ");
		cid=sc.next();
		System.out.println("Enter customer name :: ");
		cname=sc.next();
		System.out.println("Enter customer address :: ");
		cadd=sc.next();
		System.out.println("Enter customer contact :: ");
		contact=sc.next();
		
		//keep customer info in vo object
		vo=new CustomerVO();
		vo.setCid(cid);
		vo.setCname(cname);
		vo.setCadd(cadd);
		vo.setContact(contact);
		
		//get controller class object
		custController=factory.getBean("custController",CustomerController.class);
		
		try {
			//invoke method
			result=custController.handle(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
