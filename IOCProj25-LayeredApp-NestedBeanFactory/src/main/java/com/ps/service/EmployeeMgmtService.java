package com.ps.service;

import java.util.List;

import com.ps.dto.EmployeeDTO;

public interface EmployeeMgmtService {
	public List<EmployeeDTO> fetchEmpsByDesgs(String desg1,String desg2)throws Exception;

}
