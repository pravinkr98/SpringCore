package com.ps;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.ps.controller.MainController;
import com.ps.vo.StudentVO;

@SpringBootApplication
public class IocBootProj68StudentLayeredAppProfilesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Scanner sc=null;
		String sname,sadd,m1,m2,m3;
		MainController controller=null;
		String result=null;
		StudentVO vo=null;
		
		//create IOC container
		ctx=SpringApplication.run(IocBootProj68StudentLayeredAppProfilesApplication.class, args);
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
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//close container
		((ConfigurableApplicationContext) ctx).close();

	}

}
