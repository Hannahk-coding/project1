package com.jw.user.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@ComponentScan(basePackages = "com.jw.user.service")
@MapperScan(basePackages = "com.jw.user.mapper", sqlSessionFactoryRef = "sqlSessionFactory")
@Configuration	
@PropertySource("classpath:application-${spring.profiles.active:dev}.properties")
public class DataSourceConfig implements TransactionManagementConfigurer {
		
	@Autowired
	private ApplicationContext applicationContext;
	
	// Hikari DataSource
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.hikari")
	public HikariConfig hikariConfig() {
		return new HikariConfig();
	}
	
	@Bean
	public DataSource datasource() {
		return new HikariDataSource(hikariConfig());
	}
	
	// SqlSessionFactory
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
		sqlSessionFactory.setDataSource(datasource());
		sqlSessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mapper/*.xml"));
		sqlSessionFactory.setConfiguration(mybatisConfig());
		return sqlSessionFactory.getObject();
	}
	
	@Bean
    public SqlSessionTemplate sqlSession(SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
	}
	
    @Bean
    @ConfigurationProperties(prefix="mybatis.configuration")
    public org.apache.ibatis.session.Configuration mybatisConfig() {
    	return new org.apache.ibatis.session.Configuration();
    }
	
	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(datasource());
	}
	
	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		return transactionManager();
	}
}
