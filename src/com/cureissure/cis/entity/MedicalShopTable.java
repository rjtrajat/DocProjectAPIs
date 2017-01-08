package com.cureissure.cis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.*;

@Entity
@Data
@Table(name="medical_shop_table")
@Component
public class MedicalShopTable {

	 @Id
	 @Column(name="CIS_MED_ID")
	 private String cismedid;
	 
	 @Column(name="LONGITUDE")
	 private double longitude;
	 
	 @Column(name="LATITUDE")
	 private double latitude;
	 
	 @Column(name="FULL_ADDRESS")
	 private String fulladdress;
	 
	 @Column(name="MAIL_ID")
	 private String mailid ;
	 
	 @Column(name="CONTACT")
	 private String contact;
	 
	 @Column(name="MEDICAL_SHOP_NAME")
	 private String medicalshopname;
	 
	
	 
	
}
