package com.ps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ps.dto.StudentDTO;
import com.ps.service.StudentOperationService;
import com.ps.vo.StudentVO;

@Controller("stdController")
public class MainController {
	
	@Autowired
	private StudentOperationService service;

	public String handle(StudentVO vo)throws Exception{
		StudentDTO dto=null;
		String result=null;
		
		dto=new StudentDTO();
		//convert VO class object to DTO class object
		dto.setSname(vo.getSname());
		dto.setSadd(vo.getSadd());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		
		//use service
		result=service.register(dto);
		return result;
	}	

}
