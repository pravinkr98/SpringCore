package com.ps.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;

public class Course {
	private int courseId;
	private String courseName;
	
	@Autowired
	private Calendar dos;
	
	public Course() {
		System.out.println("Course.Course()");
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", dos=" + dos + "]";
	}
	
	
}
