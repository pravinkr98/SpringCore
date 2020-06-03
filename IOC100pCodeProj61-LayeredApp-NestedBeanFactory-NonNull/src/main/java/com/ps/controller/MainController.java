package com.ps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Controller;

import com.ps.dto.EmployeeDTO;
import com.ps.service.EmployeeMgmtService;

@Controller("empController")
@Lazy
public class MainController {
	
	@Autowired
	private EmployeeMgmtService service;
	
	public @NonNull List<EmployeeDTO>  fetchEmpsByDesgs(@NonNull String desg1,@NonNull String desg2)throws Exception{
		List<EmployeeDTO> listDTO=null;
		//use service
		listDTO=service.fetchEmpsByDesgs(desg1, desg2);
		return listDTO;
	}
	
	

}
