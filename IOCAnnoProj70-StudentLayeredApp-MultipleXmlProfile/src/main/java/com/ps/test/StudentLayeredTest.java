package com.ps.test;

import java.util.Arrays;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;

import com.ps.controller.MainController;
import com.ps.vo.StudentVO;

public class StudentLayeredTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Environment env=null;
		Scanner sc=null;
		String sname,sadd,m1,m2,m3;
		MainController controller=null;
		String result=null;
		StudentVO vo=null;
		
		//create IOC container
		ctx=new ClassPathXmlApplicationContext();
		//get access to env object
		env=ctx.getEnvironment();
		//set Active profile
		((ConfigurableEnvironment)env).setActiveProfiles("test");
		//locate xml file
		((ClassPathXmlApplicationContext)ctx).setConfigLocation("com/ps/cfgs/applicationContext.xml");
		((AbstractApplicationContext)ctx).refresh();
		
		//read input(5)sname,sadd,m1,m2,m3 from enduser and keep them in StudentVO class obj as inputs (String)
		sc=new Scanner(System.in);
		System.out.println("Input student sname :: ");
		sname=sc.next();
		System.out.println("Input student sadd :: ");
		sadd=sc.next();
		System.out.println("Input student marks 1 :: ");
		m1=sc.next();
		System.out.println("Input student marks 2 :: ");
		m2=sc.next();
		System.out.println("Input student marks 3 :: ");
		m3=sc.next();
		
		vo=new StudentVO();
		vo.setSname(sname);
		vo.setSadd(sadd);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		
		//get Controller class obj
		controller=ctx.getBean("stdController",MainController.class);
		
		try {
			//invoke methods
			result=controller.handle(vo);
			System.out.println(result);
			System.out.println("Active profile :: "+Arrays.deepToString((env.getActiveProfiles())));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//close container
		((AbstractApplicationContext) ctx).close();


	}

}
