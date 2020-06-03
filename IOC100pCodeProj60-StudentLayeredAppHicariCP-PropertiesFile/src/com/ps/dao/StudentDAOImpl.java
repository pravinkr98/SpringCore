package com.ps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

import com.ps.bo.StudentBO;

@Repository("stdDAO")
public class StudentDAOImpl implements StudentDAO {
	
	@Value("${os.name}")
	private String os;
	@Value("${java.vm.specification.vendor}")
	private String javaVendor;
	@Value("${Path}")
	private String pathVal;
	
	private static final String INSERT_QUERY="INSERT INTO STUDENT(SNAME,SADD,AVG,TOTAL,RESULT) VALUES(?,?,?,?,?)";
	
	@Autowired
	private DataSource ds;		
		
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
