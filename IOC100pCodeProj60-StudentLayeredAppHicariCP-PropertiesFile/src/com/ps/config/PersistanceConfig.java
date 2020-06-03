package com.ps.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.lang.Nullable;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.ps.dao")
@PropertySource( "com/ps/commons/Jdbc.properties")
public class PersistanceConfig {
		
	@Value("${jdbc.driver}")
	@Nullable
	private String driver;
	
	@Value("${jdbc.url}")
	@Nullable
	private String url;
	
	@Value("${jdbc.user}")
	@Nullable
	private String username;
	
	@Value("${jdbc.pwd}")
	@Nullable
	private String pwd;
	
	@Value("${jdbc.pool.poolSize}")
	@Nullable
	private String poolSize;
	
	@Value("${jdbc.pool.idleTimeout}")
	@Nullable
	private String idleTimeout;
	
	@Value("${jdbc.pool.minIdle}")
	@Nullable
	private String minIdle;
	
	@Value("${os.name}")
	@Nullable
	private String os;
	
	@Bean
	public HikariDataSource createHKDS() {
		HikariDataSource hkds=null;
		//create object
		hkds=new HikariDataSource();
		hkds.setDriverClassName(driver);
		hkds.setJdbcUrl(url);
		hkds.setUsername(username);
		hkds.setPassword(pwd);
		hkds.setMaximumPoolSize(Integer.parseInt(poolSize));
		hkds.setIdleTimeout(Integer.parseInt(idleTimeout));
		hkds.setMinimumIdle(Integer.parseInt(minIdle));
		System.out.println("os name :: "+os);
		//return dataSource
		return hkds;
	}
	
	/*@Autowired
	private Environment env;
	
	@Bean
	public HikariDataSource createHKDS() {
		HikariDataSource hkds=null;
		//create object
		hkds=new HikariDataSource();
		hkds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		hkds.setJdbcUrl(env.getRequiredProperty("jdbc.url"));
		hkds.setUsername(env.getRequiredProperty("jdbc.user"));
		hkds.setPassword(env.getRequiredProperty("jdbc.pwd"));
		hkds.setMaximumPoolSize(Integer.parseInt(env.getRequiredProperty("jdbc.pool.poolSize")));
		hkds.setIdleTimeout(Integer.parseInt(env.getRequiredProperty("jdbc.pool.idleTimeout")));
		hkds.setMinimumIdle(Integer.parseInt(env.getRequiredProperty("jdbc.pool.minIdle")));
		System.out.println("os name "+env.getRequiredProperty("os.name"));
		System.out.println("Path value :: "+env.getRequiredProperty("Path"));
		//return dataSource
		return hkds;
	}*/
	
	/*@Bean
	public HikariDataSource createHKDS() {
		HikariDataSource hkds=null;
		//create object
		hkds=new HikariDataSource();
		hkds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		hkds.setJdbcUrl("jdbc:mysql:///praveendb");
		hkds.setUsername("root");
		hkds.setPassword("root");
		hkds.setMaximumPoolSize(30);
		hkds.setIdleTimeout(1000);
		hkds.setMinimumIdle(5);
		//return dataSource
		return hkds;
	}*/
	
		
	 
}
