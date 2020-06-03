package com.ps.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.bo.EmployeeBO;
import com.ps.dao.EmployeeDAO;
import com.ps.dto.EmployeeDTO;

@Service("empService")
public class EmployeeMgmtServiceImpl implements EmployeeMgmtService {
	
	@Autowired
	private EmployeeDAO dao;
	
	@Override
	public List<EmployeeDTO> fetchEmpsByDesgs(String desg1, String desg2) throws Exception {
		List<EmployeeDTO> listDTO=new ArrayList();
		List<EmployeeBO> listBO=null;
		//use DAO
		listBO=dao.getEmpsByDesgs(desg1, desg2);
		//copy listBO to listDTO
		listBO.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			//add each dto to listDTO object
			listDTO.add(dto);
		});
		return listDTO;
	}

}
