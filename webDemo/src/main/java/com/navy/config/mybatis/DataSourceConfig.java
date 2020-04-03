package com.navy.config.mybatis;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	@Value("${spring.datasource.url:jdbc:mysql://47.107.189.213:3306/test}")
	private String dbUrl;
	
	@Value("${spring.datasource.username:root}")
	private String username;
	
	@Value("${spring.datasource.password:haiShui2018}")
	private String password;
	
	@Value("${spring.datasource.driverClassName:com.mysql.cj.jdbc.Driver}")
	private String driverClassName;
	
	@Value("${spring.datasource.initialSize:5}")
	private int initialSize;
	
	@Value("${spring.datasource.minIdle:10}")
	private int minIdle;
	
	@Value("${spring.datasource.maxIdle:15}")
	private int maxIdle;
	
	@Value("${spring.datasource.maxActive:20}")
	private int maxActive;
	
	@Value("${spring.datasource.maxWait:10000}")
	private int maxWait;
	
	@Value("${spring.datasource.timeBetweenEvictionRunsMillis:30000}")
	private int timeBetweenEvictionRunsMillis;
	
	@Value("${spring.datasource.minEvictableIdleTimeMillis:1800000}")
	private int minEvictableIdleTimeMillis;
	
	@Value("${spring.datasource.validationQuery:SELECT 1}")
	private String validationQuery;
	
	@Value("${spring.datasource.testWhileIdle:true}")
	private boolean testWhileIdle;
	
	@Value("${spring.datasource.testOnBorrow:true}")
	private boolean testOnBorrow;
	
	@Value("${spring.datasource.testOnReturn:false}")
	private boolean testOnReturn;

	@Bean
	public DataSource dataSource() {
		
		DataSource datasource = new DataSource();
		
		datasource.setUrl(this.dbUrl); 
	    datasource.setUsername(username); 
	    datasource.setPassword(password); 
	    datasource.setDriverClassName(driverClassName); 
	  
	    datasource.setInitialSize(initialSize); 
	    datasource.setMinIdle(minIdle); 
	    datasource.setMaxIdle(maxIdle);
	    datasource.setMaxActive(maxActive); 
	    datasource.setMaxWait(maxWait); 
	    datasource.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis); 
	    datasource.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis); 
	    datasource.setValidationQuery(validationQuery); 
	    datasource.setTestWhileIdle(testWhileIdle); 
	    datasource.setTestOnBorrow(testOnBorrow); 
	    datasource.setTestOnReturn(testOnReturn);
	    
	    return datasource; 
	}
}
