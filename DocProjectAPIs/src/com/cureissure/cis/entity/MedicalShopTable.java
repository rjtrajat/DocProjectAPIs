package com.cureissure.cis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;
import lombok.*;

@Entity
@Data
@Table(name="medical_shop_table")
public class MedicalShopTable {

	 @Id
	 private String CIS_MED_ID;
	 private Long LONGITUDE;
	 private Long LATITUDE;
	 private String FULL_ADDRESS;
	 private String MAIL_ID ;
	 private String CONTACT;
	 private String MEDICAL_SHOP_NAME;	
	
}
