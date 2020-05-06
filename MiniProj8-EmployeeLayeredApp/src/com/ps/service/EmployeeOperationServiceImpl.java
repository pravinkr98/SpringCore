package com.ps.service;

import com.ps.bo.EmployeeBO;
import com.ps.dao.EmployeeDAO;
import com.ps.dto.EmployeeDTO;

public class EmployeeOperationServiceImpl implements EmployeeOperationService {
	EmployeeDAO dao;

	public EmployeeOperationServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}
	
	public String register(EmployeeDTO dto) throws Exception {
		EmployeeBO bo=null;
		double gross=0.0,sal=0.0;	
		int count=0;
		sal=dto.getSal();
		//write b.logic and keep them in bo object
		gross=sal+sal*.10+sal*.20+sal*.30;
		//keep dto object into bo object
		bo=new EmployeeBO();
		bo.setEmpno(dto.getEmpno());
		bo.setEname(dto.getEname());
		bo.setEadd(dto.getEadd());
		bo.setJob(bo.getJob());
		bo.setSal(gross);
		bo.setDept(dto.getDept());
		
		//use DAO
		count=dao.insert(bo);
		if(count==0)
			return "Employee registration failed";
		else
			return "Employee registration succeded. Gross Salary :: "+gross;		
	}

}
