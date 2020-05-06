package com.ps.test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ps.controller.EmployeeController;
import com.ps.vo.EmployeeVO;

public class EmployeeRegistrationTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Scanner sc=null;
		String empno,ename,eadd,job,sal,dept;
		EmployeeVO vo=null;
		EmployeeController empController=null;
		String result=null;
		
		factory=new XmlBeanFactory(new ClassPathResource("com/ps/cfgs/applicationContext.xml"));
		sc=new Scanner(System.in);
		System.out.println("Enter employee no. :: ");
		empno=sc.next();
		System.out.println("Enter employee name :: ");
		ename=sc.next();
		System.out.println("Enter employee address :: ");
		eadd=sc.next();
		System.out.println("Enter employee job :: ");
		job=sc.next();
		System.out.println("Enter employee salary :: ");
		sal=sc.next();
		System.out.println("Enter employee department :: ");
		dept=sc.next();
		
		//keep form data in EmployeeVO object
		vo=new EmployeeVO();
		vo.setEmpno(empno);
		vo.setEname(ename);
		vo.setEadd(eadd);
		vo.setJob(job);
		vo.setSal(sal);
		vo.setDept(dept);
		
		//get controller class object
		empController=factory.getBean("empController",EmployeeController.class);
		
		try {
			//invoke methods
			result=empController.handle(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
