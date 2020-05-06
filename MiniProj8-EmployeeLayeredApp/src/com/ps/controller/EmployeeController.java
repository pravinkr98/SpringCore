package com.ps.controller;

import com.ps.dto.EmployeeDTO;
import com.ps.service.EmployeeOperationService;
import com.ps.vo.EmployeeVO;

public class EmployeeController {
	EmployeeOperationService service;

	public EmployeeController(EmployeeOperationService service) {
		this.service = service;
	}
	
	public String handle(EmployeeVO vo)throws Exception{
		EmployeeDTO dto=null;
		String result=null;
		
		dto=new EmployeeDTO();
		//keep EmployeeVO object into EmployeeDTO object
		dto.setEmpno(Integer.parseInt(vo.getEmpno()));
		dto.setEname(vo.getEname());
		dto.setEadd(vo.getEadd());
		dto.setJob(vo.getJob());
		dto.setSal(Double.parseDouble(vo.getSal()));
		dto.setDept(Integer.parseInt(vo.getDept()));
		
		//call EmployeeOperationService class register method
		result=service.register(dto);
		return result;		
	}
}
