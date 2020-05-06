package com.ps.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ps.controller.MainController;
import com.ps.vo.StudentVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Scanner sc=null;
		String sno,sname,sadd,m1,m2,m3;
		MainController controller=null;
		String result=null;
		StudentVO vo=null;
		
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/ps/cfgs/applicationContext.xml"));
		//read input(6)sno,sname,sadd,m1,m2,m3 from enduser and keep them in StudentVO class obj as inputs (String)
		sc=new Scanner(System.in);
		System.out.println("Input student sno :: ");
		sno=sc.next();
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
		vo.setSno(sno);
		vo.setSname(sname);
		vo.setSadd(sadd);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		
		//get Controller class obj
		controller=factory.getBean("controller",MainController.class);
		
		try {
			//invoke methods
			result=controller.handle(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
