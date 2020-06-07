package com.ps.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.ps.bo.StudentBO;

@Repository("stdDAO")
@Profile(value = {"uat","prod"})
public class StudentDAOImpl1 implements StudentDAO {
	public static final String INSERT_QUERY="INSERT INTO STUDENT(SNO,NAME,ADDRS,AVG,TOTAL,RESULT) VALUES(JSID_SEQ.NEXTVAL,?,?,?,?,?)";
	
	@Autowired
	private DataSource ds;
	
	private Connection con=null;
	private PreparedStatement ps=null;	
		
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
