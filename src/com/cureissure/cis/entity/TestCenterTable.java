package com.cureissure.cis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import java.util.Date;
import lombok.*;

@Entity
@Data
@Table(name="test_center_table")
@Component
public class TestCenterTable {

	 @Id
	 private String CIS_TEST_ID;
	 private Long LONGITUDE;
	 private Long LATITUDE;
	 private String FULL_ADDRESS;
	 private String ABOUT_TEST_CENTER ;
	 private String MAIL_ID ;
	 private String CONTACT;
	 private Date ESTABLISHED ;
	 private String SPECIALIZATION;
	 private String TEST_CENTER_NAME;	
	
}
