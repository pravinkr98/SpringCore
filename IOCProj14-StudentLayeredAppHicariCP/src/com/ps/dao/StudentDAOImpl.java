package com.ps.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.ps.bo.StudentBO;

public final class StudentDAOImpl implements StudentDAO {
	public static final String INSERT_QUERY="INSERT INTO STUDENT(SNAME,SADD,AVG,TOTAL,RESULT) VALUES(?,?,?,?,?)";
	public DataSource ds;
	Connection con=null;
	PreparedStatement ps=null;	
	
	public StudentDAOImpl(DataSource ds) {
		this.ds=ds;
	}	
	
	public int insert(StudentBO bo) throws Exception {
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
