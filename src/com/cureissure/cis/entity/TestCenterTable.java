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
@Table(name="test_center_table")
@Component
public class TestCenterTable {

	 @Id
	 @Column(name="CIS_TEST_ID")
	 private String cistestid;
	 
	 @Column(name="LONGITUDE")
	 private double longitude;
	 
	 @Column(name="LATITUDE")
	 private double latitude;
	 
	 @Column(name="FULL_ADDRESS")
	 private String fulladdress;
	 
	 @Column(name="ABOUT_TEST_CENTER")
	 private String abouttestcenter ;
	 
	 @Column(name="MAIL_ID")
	 private String mailid ;
	 
	 @Column(name="CONTACT")
	 private String contact;
	 
	 @Column(name="ESTABLISHED")
	 private Date established ;
	 
	 @Column(name="SPECIALIZATION")
	 private String specialization;
	 
	 @Column(name="TEST_CENTER_NAME")
	 private String testcentername;	
	 
	 @Column(name="FEES")
	 private String fees; 
	 
	 @Column(name="DAYS_CLOSED")
	 private String daysclosed; 
	 
	 @Column(name="OPEN_TIME")
	 private String opentime; 
	 
	 @Column(name="IMAGE_THUMB")
	 private String imagethumb;
	 
	 @Column(name="IMAGE_URLS")
	 private String imageurls;
	 
	 @Column(name="RATING")
	 private double rating;
	
}
