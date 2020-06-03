package com.ps.bo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class EmployeeBO {
	private int empno;
	private String ename;
	private String  job;
	private float salary;
	private int deptno;
	private int mgr;

}
