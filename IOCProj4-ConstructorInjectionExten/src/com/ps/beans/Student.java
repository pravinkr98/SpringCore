package com.ps.beans;

public class Student {
	private int sno;
	private String sname;
	private float avg;
	
	private Student(int sno, String sname, float avg) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.avg = avg;
	}

	private Student(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", avg=" + avg + "]";
	}
	
	
	
	
	
	
}
