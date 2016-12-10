package com.cureissure.cis.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;
import lombok.*;

@Entity
@Data
@Table(name="hospital_table")
public class HospitalTable {

	 @Id
	 private String CIS_HOS_ID;
	 private Long LONGITUDE;
	 private Long LATITUDE;
	 private String FULL_ADDRESS;
	 private String ABOUT_HOSPITAL ;
	 private String MAIL_ID ;
	 private String CONTACT;
	 private Date ESTABLISHED ;
	 private String SPECIALIZATION;
	 private String HOSPITAL_NAME;	
	
}
