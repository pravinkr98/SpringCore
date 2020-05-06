package com.ps.dto;

import java.io.Serializable;

public class StudentDTO implements Serializable {
	private String sname;
	private String sadd;
	private int m1,m2,m3;
		
	public void setSname(String sname) {
		this.sname = sname;
	}	
	public void setSadd(String sadd) {
		this.sadd = sadd;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	public String getSname() {
		return sname;
	}
	public String getSadd() {
		return sadd;
	}
	public int getM1() {
		return m1;
	}
	public int getM2() {
		return m2;
	}	
	public int getM3() {
		return m3;
	}
}
