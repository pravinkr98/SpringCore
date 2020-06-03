package com.ps.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmployeeDTO implements Serializable {
	private int empno;
	private String ename;
	private String  job;
	private float salary;
	private int deptno;
	private int mgr;
	
	
}
