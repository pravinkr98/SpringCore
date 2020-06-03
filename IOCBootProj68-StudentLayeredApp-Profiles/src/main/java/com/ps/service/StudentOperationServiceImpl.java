package com.ps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.bo.StudentBO;
import com.ps.dao.StudentDAO;
import com.ps.dto.StudentDTO;

@Service("stdService")
public class StudentOperationServiceImpl implements StudentOperationService {
	
	@Autowired
	private StudentDAO dao;
	
	public String register(StudentDTO dto) throws Exception {
		StudentBO bo=null;
		int total=0;
		float avg=0.0f;
		String result=null;
		int count=0;
		
		//write b.logic by collecting input from dto
		total=dto.getM1()+dto.getM2()+dto.getM3();
		avg=total/3;
		if(dto.getM1()<35||dto.getM2()<35||dto.getM3()<35)
			result="fail";
		else
			result="pass";
		
		//prepare bo having sno,sname,sadd,total,avg,result
		bo=new StudentBO();
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		
		//use DAO
		count=dao.insert(bo);
		if(count==0)
			return "Student registration failed";
		else
			return "Student registration succeded. Total marks :: "+total+", Result :: "+result;
	}
	
}
