package com.cureissure.cis.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import com.cureissure.cis.repository.RepositoryDoctorTable;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder ;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder  ;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Configuration
@EnableJpaRepositories(entityManagerFactoryRef="cisEntityManagerFactory",basePackages="com.cureissure.cis.repository")
public class configclass {

	@Bean(name="cisTransactionManager")
	public PlatformTransactionManager cisTransactionManager(@Qualifier("cisEntityManagerFactory" ) EntityManagerFactory entityManagerFactory )
	{
		return new JpaTransactionManager(entityManagerFactory);
	}
	@Bean(name="cisEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean cisEntityManagerFactory(EntityManagerFactoryBuilder builder,@Qualifier("dscis")DataSource datasource){
		return builder.dataSource(datasource).packages("com.cureissure.cis.entity").persistenceUnit("cis").build();
	}
	
	
	@Bean(name="dscis")
	@ConfigurationProperties(prefix="spring.ds_cis")
	public DataSource cisMysqlDataSource(){
		return DataSourceBuilder.create().build();
	}
	
	

}
