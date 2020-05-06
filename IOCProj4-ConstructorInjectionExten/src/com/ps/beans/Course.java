package com.ps.beans;

public class Course {
	private int cid;
	private String cname;
	private String facultyName;
	private float cfee;
	
	public Course(int cid, String cname, String facultyName, float cfee) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.facultyName = facultyName;
		this.cfee = cfee;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", facultyName=" + facultyName + ", cfee=" + cfee + "]";
	}
	
	
	
	
}
