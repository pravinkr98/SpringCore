package com.ps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import com.ps.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private DataSource ds;
	
	private static final String GET_EMPS_BY_DESGS="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO,MGR FROM EMP WHERE JOB=? OR JOB=?";
	@Override
	public @NonNull List<EmployeeBO> getEmpsByDesgs(@NonNull String desg1,@NonNull String desg2) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		List<EmployeeBO> listBO=null;
		EmployeeBO bo=null;
		try {
			//get Pooled JDBC con object
			con=ds.getConnection();
			//create PreparedStatement object
			ps=con.prepareStatement(GET_EMPS_BY_DESGS);
			//set  query param values
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			//execute the query
			rs=ps.executeQuery();
			//copy ResultSet records to ListBO objects
			listBO=new ArrayList();
			while(rs.next()) {
				bo=new EmployeeBO();
				bo.setEmpno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSalary(rs.getFloat(4));
				bo.setDeptno(rs.getInt(5));
				bo.setMgr(rs.getInt(6));
				//add each BO class object to listBO
				listBO.add(bo);
			}//while
					
		}//try
		catch(SQLException se) {
			se.printStackTrace();
			throw se; //exception rethrowing....
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		finally {
			//close jdbc objs
			try {
				if(rs!=null)
					rs.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		}//finally
		
		return listBO;
	}

}
