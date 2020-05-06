package com.ps.service;

import com.ps.bo.CustomerBO;
import com.ps.dao.CustomerDAO;
import com.ps.dto.CustomerDTO;

public class CustomerOpertaionDerviceImpl implements CustomerOperationService {
	CustomerDAO dao;

	public CustomerOpertaionDerviceImpl(CustomerDAO dao) {
		this.dao = dao;
	}

	@Override
	public String register(CustomerDTO dto) throws Exception {
		CustomerBO bo=null;
		int i=0;
		//write b.logic
		//keep dto object into bo object
		bo=new CustomerBO();
		bo.setCid(dto.getCid());
		bo.setCname(dto.getCname());
		bo.setCadd(dto.getCadd());
		bo.setContact(dto.getContact());
		
		//call CustomerDAO class insert method
		i=dao.insert(bo);
		
		if(i==0)
			return "Customer registration failed.";
		else
			return "Customer registration successfull.";
	}

}
