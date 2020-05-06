package com.ps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.ps.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
	public static final String INSERT_QUERY="INSERT INTO EMP VALUES(?,?,?,?,?,?)";
	DataSource ds=null;
	Connection con=null;
	PreparedStatement ps=null;
	
	public EmployeeDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(EmployeeBO bo) throws Exception {
		int i=0;
		con=ds.getConnection();
		ps=con.prepareStatement(INSERT_QUERY);
		ps.setInt(1, bo.getEmpno());
		ps.setString(2, bo.getEname());
		ps.setString(3, bo.getEadd());
		ps.setString(4, bo.getJob());
		ps.setDouble(5, bo.getSal());
		ps.setInt(6, bo.getDept());
		i=ps.executeUpdate();
		return i;
	}

}
