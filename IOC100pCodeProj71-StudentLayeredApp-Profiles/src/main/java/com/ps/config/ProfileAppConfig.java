
package com.ps.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = {"com.ps.controller","com.ps.dao","com.ps.service"})
public class ProfileAppConfig {
	
	@Bean
	@Profile("dev")
	public DataSource createBasicDS()throws Exception {
		BasicDataSource ds=null;
		//create object
		ds=new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql:///praveendb");
		ds.setUsername("root");
		ds.setPassword("root");
		//return dataSource
		return ds;
	}
	
	@Bean
	@Profile("test")
	public DataSource createHkDS()throws Exception {
		HikariDataSource hkds=null;
		//create object
		hkds=new HikariDataSource();
		hkds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		hkds.setJdbcUrl("jdbc:mysql:///praveendb");
		hkds.setUsername("root");
		hkds.setPassword("root");
		//return dataSource
		return hkds;
	}
	
	@Bean
	@Profile("uat")
	public DataSource createCPDS() throws Exception {
		ComboPooledDataSource ds=null;
		//create object
		ds=new ComboPooledDataSource();
		ds.setDriverClass("oracle.jdbc.driver.OracleDriver");
		ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUser("system");
		ds.setPassword("manager");
		//return dataSource
		return ds;
	}
	
	@Bean
	@Profile("prod")
	public HikariDataSource createHKDS()throws Exception {
		HikariDataSource hkds=null;
		//create object
		hkds=new HikariDataSource();
		hkds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hkds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		hkds.setUsername("system");
		hkds.setPassword("manager");
		//return dataSource
		return hkds;
	}

}
