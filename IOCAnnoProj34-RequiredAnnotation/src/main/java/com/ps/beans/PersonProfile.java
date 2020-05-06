package com.ps.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

import lombok.ToString;

@ToString
public class PersonProfile {
	private int pid;
	private String pname,paddrs;
	private Date dob;
	
	@Required
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	@Required
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public void setPaddrs(String paddrs) {
		this.paddrs = paddrs;
	}
	
	//@Required
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	

	

}
