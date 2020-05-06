package com.ps.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.ps.bo.StudentBO;

public final class StudentDAOImpl implements StudentDAO {
	private String os;
	private String javaVendor;
	private String pathVal;
	
	private static final String INSERT_QUERY="INSERT INTO STUDENT(SNAME,SADD,AVG,TOTAL,RESULT) VALUES(?,?,?,?,?)";
	private DataSource ds;		
	
	public StudentDAOImpl(DataSource ds) {
		this.ds=ds;
	}	
	
	public void setOs(String os) {
		System.out.println("StudentDAOImpl.setOs()");
		this.os=os;
	}
	
	public void setJavaVendor(String javaVendor) {
		System.out.println("StudentDAOImpl.setJavaVendor()");
		this.javaVendor=javaVendor;
	}
	
	public void setPathVal(String pathVal) {
		System.out.println("StudentDAOImpl.setPathVal()"); 
		this.pathVal=pathVal;
	}
	
	public int insert(StudentBO bo) throws Exception {
		System.out.println("system properties :: "+os+"     "+javaVendor+"     "+pathVal);
		Connection con=null;
		PreparedStatement ps=null;
		int i=0;
		con=ds.getConnection();
		ps=con.prepareStatement(INSERT_QUERY);
		ps.setString(1, bo.getSname());
		ps.setString(2, bo.getSadd());
		ps.setFloat(3, bo.getAvg());
		ps.setInt(4, bo.getTotal());
		ps.setString(5, bo.getResult());
		i=ps.executeUpdate();
		return i;
	}		
}
