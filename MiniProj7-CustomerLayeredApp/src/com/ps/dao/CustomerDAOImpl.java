package com.ps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.ps.bo.CustomerBO;

public class CustomerDAOImpl implements CustomerDAO {
	public static final String INSERT_QUERY="INSERT INTO CUSTOMER VALUES(?,?,?,?)";
	DataSource ds;
	Connection con;
	PreparedStatement ps;

	public CustomerDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBO bo) throws Exception {
		int i=0;
		con=ds.getConnection();
		ps=con.prepareStatement(INSERT_QUERY);
		ps.setInt(1, bo.getCid());
		ps.setString(2, bo.getCname());
		ps.setString(3, bo.getCadd());
		ps.setLong(4, bo.getContact());
		i=ps.executeUpdate();		
		return i;
	}

}
