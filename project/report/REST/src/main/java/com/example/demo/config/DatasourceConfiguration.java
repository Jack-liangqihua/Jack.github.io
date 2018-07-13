package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DatasourceConfiguration {

//	@Bean(name = "dataSource")
//	@Qualifier("dataSource") 
//	@ConfigurationProperties(prefix = "c3p0")
//	public DataSource dataSource() {
//		return DataSourceBuilder.create().type(com.mchange.v2.c3p0.ComboPooledDataSource.class).build();
//	}
	//
	// @Bean(name = "pmioaDS")
	// @Qualifier("pmioaDS")
	// @ConfigurationProperties(prefix = "pmioa")
	// public DataSource PLM_dataSource() {
	// return
	// DataSourceBuilder.create().type(com.mchange.v2.c3p0.ComboPooledDataSource.class).build();
	// }

	@Bean(name = "primaryDataSource")
	@Qualifier("primaryDataSource")
	@Primary
	@ConfigurationProperties(prefix = "c3p0")
	public DataSource primaryDataSource() {
		return DataSourceBuilder.create().type(com.mchange.v2.c3p0.ComboPooledDataSource.class).build();
	}

	@Bean(name = "secondaryDataSource")
	@Qualifier("secondaryDataSource")
	@ConfigurationProperties(prefix = "pmioa")
	public DataSource secondaryDataSource() {
//		return DataSourceBuilder.create().build();
		return DataSourceBuilder.create().type(com.mchange.v2.c3p0.ComboPooledDataSource.class).build();
	}
	
	@Bean(name = "thirdlyDataSource")
	@Qualifier("thirdlyDataSource")
	@ConfigurationProperties(prefix = "plm")
	public DataSource thirdlyDataSource() {
//		return DataSourceBuilder.create().build();
		return DataSourceBuilder.create().type(com.mchange.v2.c3p0.ComboPooledDataSource.class).build();
	}
	 

	@Bean(name = "primaryJdbcTemplate")
	public JdbcTemplate primaryJdbcTemplate(@Qualifier("primaryDataSource") DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	@Bean(name = "secondaryJdbcTemplate")
	public JdbcTemplate secondaryJdbcTemplate(@Qualifier("secondaryDataSource") DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	} 
	@Bean(name = "thirdlyJdbcTemplate")
	public JdbcTemplate thirdlyJdbcTemplate(@Qualifier("thirdlyDataSource") DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
 
}