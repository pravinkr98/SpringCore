package com.ps.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ps.config.BusinessAppConfig;
import com.ps.config.PresentationAppConfig;
import com.ps.controller.MainController;
import com.ps.dto.EmployeeDTO;

public class NestedBeanFactoryTest {

	public static void main(String[] args) {
		ApplicationContext ctxParent=null,ctxChild=null;
		MainController controller=null;
		List<EmployeeDTO> listDTO=null;
		
		//create Parent IOC container
		ctxParent=new AnnotationConfigApplicationContext(BusinessAppConfig.class);
		
		//create child IOC container
		ctxChild=new AnnotationConfigApplicationContext(PresentationAppConfig.class);
		//set parent container in  child container
		((AnnotationConfigApplicationContext)ctxChild).setParent(ctxParent);
		
		//get Controller class object
		controller=ctxChild.getBean("empController", MainController.class);
		
		//invoke methods
		try {
			listDTO=controller.fetchEmpsByDesgs("CLERK", "MANAGER");
			listDTO.forEach(dto->{
				System.out.println(dto);
			});
			
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//close Parent container
		((AbstractApplicationContext) ctxParent).close();
		//close Child container
		((AbstractApplicationContext) ctxChild).close();

	}//main

}//class
