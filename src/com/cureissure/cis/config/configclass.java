package com.cureissure.cis.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

import com.cureissure.cis.repository.RepositoryDoctorTable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder ;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder  ;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
//@EnableJpaRepositories(entityManagerFactoryRef="cisEntityManagerFactory",basePackages="com.cureissure.cis.repository")
//@EnableAutoConfiguration
public class configclass {

	@Bean/*(name="cisTransactionManager")*/
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
	
//	
//	@Bean(name="cisTransactionManager")
//	public PlatformTransactionManager cisTransactionManager(@Qualifier("cisEntityManagerFactory" ) EntityManagerFactory entityManagerFactory )
//	{
//		return new JpaTransactionManager(entityManagerFactory);
//	}
//	@Bean(name="cisEntityManagerFactory")
//	public LocalContainerEntityManagerFactoryBean cisEntityManagerFactory(EntityManagerFactoryBuilder builder,@Qualifier("dscis")DataSource datasource){
//			
//		return builder.dataSource(datasource).packages("com.cureissure.cis.entity").persistenceUnit("cis").build();
//	}
//	
	
	@Bean(name="dscis")
//	@ConfigurationProperties(prefix="spring.ds_cis")
	public DataSource cisMysqlDataSource(){
//		return DataSourceBuilder.create().build();
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.url("jdbc:mysql://cis-database-cureissure.c6jcobtf46el.us-west-2.rds.amazonaws.com:3306/cis_dev");
		dataSourceBuilder.username("cis_master_user");
		dataSourceBuilder.password("kunDAN1!");
		dataSourceBuilder.driverClassName("com.mysql.jdbc.Driver");
		
		DataSource datasource =  dataSourceBuilder.build();
		return datasource;
		
	}
//	
//	@Bean
//	public EntityManagerFactoryBuilder entityManagerFactoryBuilder(JpaVendorAdapter jpaVendorAdapter){
//		return new EntityManagerFactoryBuilder(jpaVendorAdapter,null, null);
//	}
//	@Bean JpaVendorAdapter hibernateJpaVendorAdapter(){
//		return new HibernateJpaVendorAdapter();
//	}
	

}
