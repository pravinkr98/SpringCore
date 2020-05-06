package com.ps.controller;

import com.ps.dto.CustomerDTO;
import com.ps.service.CustomerOperationService;
import com.ps.vo.CustomerVO;

public class CustomerController {
	CustomerOperationService service;

	public CustomerController(CustomerOperationService service) {
		this.service = service;
	}
	
	public String handle(CustomerVO vo)throws Exception{
		CustomerDTO dto=null;
		String result=null;
		
		dto=new CustomerDTO();
		dto.setCid(Integer.parseInt(vo.getCid()));
		dto.setCname(vo.getCname());
		dto.setCadd(vo.getCadd());
		dto.setContact(Long.parseLong(vo.getContact()));
		
		//call CustomerOperationService class register method
		result=service.register(dto);
		return result;
	}
	
	

}
