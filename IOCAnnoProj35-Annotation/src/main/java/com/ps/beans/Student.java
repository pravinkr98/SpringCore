package com.ps.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int sno;
	private String sname;
	
	//@Qualifier("c2")
	//@Autowired
	private Course course;
	
	//@Autowired(required = true)
	private Date dob;
	
	//@Autowired
	public Student(@Qualifier("c2")Course course, Date dob,int x) {
		System.out.println("Student.Student()::3-param constructor");
		this.course = course;
		this.dob = dob;
	}
	
	@Autowired
	public Student(Course course, Date dob) {
		System.out.println("Student.Student()::2-param constructor");
		this.course = course;
		this.dob = dob;
	}

	public Student() {
		System.out.println("Student.Student()");
	}
	
	public void setSno(int sno) {
		this.sno = sno;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

	/*@Qualifier("dobDt1")
	@Autowired
	public void setDob(Date dob) {
		this.dob = dob;
	}*/

	/*@Qualifier("dobDt")
	@Autowired
	public void asignDob(Date dob) {
		this.dob = dob;
	}
	
	@Qualifier("c2")
	@Autowired
	public void asignCourse(Course course) {
		this.course = course;
	}*/

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", course=" + course + ", dob=" + dob + "]";
	}
	
		
}
