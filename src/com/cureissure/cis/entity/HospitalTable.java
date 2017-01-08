package com.cureissure.cis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import java.util.Date;
import lombok.*;

@Entity
@Data
@Table(name="hospital_table")
@Component
public class HospitalTable {

	 @Id
	 @Column(name="CIS_HOS_ID")
	 private String cishosid;
	 
	 @Column(name="LONGITUDE")
	 private double longitude;
	 
	 @Column(name="LATITUDE")
	 private double latitude;
	 
	 @Column(name="FULL_ADDRESS")
	 private String fulladdress;
	 
	 @Column(name="ABOUT_HOSPITAL")
	 private String abouthospital ;
	 
	 @Column(name="MAIL_ID")
	 private String mailid ;
	 
	 @Column(name="CONTACT")
	 private String contact;
	 
	 @Column(name="ESTABLISHED")
	 private Date established ;
	 
	 @Column(name="SPECIALIZATION")
	 private String specialization;
	 
	 @Column(name="HOSPITAL_NAME")
	 private String hospitalname;	
	 
	 @Column(name="FEES")
	 private String fees; 
	 
	 @Column(name="DAYS_CLOSED")
	 private String daysclosed; 
	 
	 @Column(name="OPEN_TIME")
	 private String opentime; 
	
}
