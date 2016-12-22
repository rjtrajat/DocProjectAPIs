package com.cureissure.cis.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder ;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class configclass {

	@Bean
	 	public PlatformTransactionManager transactionManager( EntityManagerFactory entityManagerFactory )
	 	{
	 		return new JpaTransactionManager(entityManagerFactory);
	 	}
	
	@Bean
	public EntityManagerFactory entityManagerFactory(DataSource dataSource) {
	    HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
	    vendorAdapter.setGenerateDdl(true);

	    LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
	    factory.setJpaVendorAdapter(vendorAdapter);
	    factory.setPackagesToScan("com.cureissure.cis.entity");
	    factory.setDataSource(dataSource);
	    factory.afterPropertiesSet();

	    return factory.getObject();
	}
		
	@Bean(name="dscis")
	public DataSource cisMysqlDataSource(){
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.url("jdbc:mysql://cis-database-cureissure.c6jcobtf46el.us-west-2.rds.amazonaws.com:3306/cis_dev");
		dataSourceBuilder.username("cis_master_user");
		dataSourceBuilder.password("kunDAN1!");
		dataSourceBuilder.driverClassName("com.mysql.jdbc.Driver");
		
		DataSource datasource =  dataSourceBuilder.build();
		return datasource;
		
	}

}
