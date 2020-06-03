
package com.ps.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = {"com.ps.dao","com.ps.service"})
public class BusinessAppConfig {
	
	@Bean
	public HikariDataSource createHKDS() {
		HikariDataSource hkds=null;
		//create object
		hkds=new HikariDataSource();
		hkds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		hkds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		hkds.setUsername("scott");
		hkds.setPassword("tiger");
		hkds.setMaximumPoolSize(30);
		hkds.setIdleTimeout(1000);
		hkds.setMinimumIdle(5);
		//return dataSource
		return hkds;
	}

}
