package com.ps.dao;

import java.util.List;

import com.ps.bo.EmployeeBO;

public interface EmployeeDAO {
	
	public List<EmployeeBO> getEmpsByDesgs(String desg1,String desg2)throws Exception;

}
