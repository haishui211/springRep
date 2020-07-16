package com.navy.config.mybatis;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan("com.navy.**.dao")
public class MybatisConfig {
	
	@Value("${mybatis.mapper.locations:classpath:/sqlmaps/**/*Mapper.xml}")
    private String mapperLocations;
	
	@Autowired
	private DataSource dataSource;
	
//	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception{
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		PathMatchingResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setMapperLocations(resourcePatternResolver.getResources(mapperLocations));
//		sqlSessionFactory.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
		
		return sqlSessionFactoryBean.getObject();
	}
}
