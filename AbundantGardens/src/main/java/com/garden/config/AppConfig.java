package com.garden.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration

@ComponentScan(basePackages = { "com.garden.model", "com.garden.controller", "com.garden.repository", "com.garden.service"})

@EnableWebMvc
@EnableTransactionManagement
public class AppConfig {
	
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource data = new DriverManagerDataSource();
		data.setDriverClassName("org.postgresql.Driver");
		data.setUrl(System.getenv("p2_url"));
		data.setUsername(System.getenv("p2_username"));
		data.setPassword(System.getenv("p2_password"));
		return data;
	}

//	@Bean
//	public JdbcTemplate jdbdTemplate() {
//		return new JdbcTemplate(dataSource());
//	}

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		emf.setPackagesToScan("com.garden.model");
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		emf.setJpaVendorAdapter(vendorAdapter);
		
		Properties hibernateProps = new Properties();
		
		hibernateProps.put("hibernate.show_sql", "true");
		hibernateProps.put("hibernate.hbm2ddl.auto", "create");
		emf.setJpaProperties(hibernateProps);
		
		return emf;
	}
	
	@Bean
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager tranManage = new JpaTransactionManager();
		tranManage.setEntityManagerFactory(entityManagerFactory().getObject());
		return tranManage;
	}

//	@Bean
//	public EntityManagerFactory createEntityManagerFactory() {
//	    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyMongoDB");
//	    return entityManagerFactory;
//	}
}


