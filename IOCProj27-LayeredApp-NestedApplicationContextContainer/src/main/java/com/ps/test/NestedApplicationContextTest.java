package com.ps.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ps.controller.MainController;
import com.ps.dto.EmployeeDTO;

public class NestedApplicationContextTest {

	public static void main(String[] args) {
		/*DefaultListableBeanFactory pFactory=null,cFactory=null;
		XmlBeanDefinitionReader pReader=null,cReader=null;*/
		MainController controller=null;
		List<EmployeeDTO> listDTO=null;
		ApplicationContext pCtx=null,cCtx=null;
		
		//create Parent IOC container
		/*pFactory=new DefaultListableBeanFactory();
		pReader=new XmlBeanDefinitionReader(pFactory);
		pReader.loadBeanDefinitions("com/ps/cfgs/business-tier-beans.xml");
		
		//create child IOC container
		cFactory=new DefaultListableBeanFactory(pFactory);
		cReader=new XmlBeanDefinitionReader(cFactory);
		cReader.loadBeanDefinitions("com/ps/cfgs/presentation-tier-beans.xml");*/
		
		//get Controller class object
		//controller=cFactory.getBean("controller", MainController.class);
		
		//create parent IOC container
		pCtx=new ClassPathXmlApplicationContext("com/ps/cfgs/business-tier-beans.xml");		
		//create child IOC container
		cCtx=new ClassPathXmlApplicationContext(new String[] {"com/ps/cfgs/presentation-tier-beans.xml"}, pCtx);
		//get Controller class object
		controller=cCtx.getBean("controller", MainController.class);
		
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
		
		((AbstractApplicationContext) pCtx).close();
		((AbstractApplicationContext) cCtx).close();

	}

}
