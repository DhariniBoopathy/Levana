package com.levana.levanabackend;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan("com.levana.levanabackend")
public class DBconfig {
	

	@Bean("mydatasource")
	DataSource getDataSource() {

		BasicDataSource basicDataSource = new BasicDataSource();// DriverManagerDataSource can be used
		basicDataSource.setDriverClassName("org.h2.Driver");
		basicDataSource.setUrl("jdbc:h2:tcp://localhost/~/test1");
		basicDataSource.setUsername("sa");
		basicDataSource.setPassword("sa");
		return basicDataSource;
	}

	// 2) lang undrstod by database(keywords)distinct/unique
	@Bean("myproperties")
	Properties myDbProperties() {
		Properties properties = new Properties();// hashmap
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");// crud--dml
		properties.setProperty("hibernate.hbm2ddl.auto", "update");// creating ur data structure
		properties.setProperty("hibernate.show_sql", "true");
		return properties;
	}

// 3) with the help of above config we will establish a connection

	@Autowired
	@Bean("sessionfactory")
	LocalSessionFactoryBean createSessionFactory(DataSource mydatasource, Properties myproperties) {
		// orm to create the queries
		LocalSessionFactoryBean bean = new LocalSessionFactoryBean();
		bean.setDataSource(mydatasource);
		bean.setHibernateProperties(myproperties);
		bean.setPackagesToScan("com.levana.levanabackend.Model");// package name where my pojo
		return bean;
	}

	@Autowired
	@Bean
	HibernateTransactionManager htm(SessionFactory sessionfactory) {

		HibernateTransactionManager ht = new HibernateTransactionManager();
		ht.setSessionFactory(sessionfactory);
		return ht;

	}

}
