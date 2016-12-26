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
@Table(name="appointment_table")
@Component
public class AppointmentTable {

	 @Id
	 @Column(name="UNIQUE_KEY_APPOINTMENT")
	 private String uniquekeyappointment;
	 
	 @Column(name="NAME_OF_PATIENT")
	 private String nameofpatient;
	 
	 @Column(name="CONTACT_OF_PATIENT")
	 private String contactofpatient;
	 
	 @Column(name="MAIL_ID_OF_PATIENT")
	 private String mailidofpatient;
	 
	 @Column(name="LONGITUDE_OF_PATIENT")
	 private double longitudeofpatient;
	 
	 @Column(name="LATITUDE_OF_PATIENT")
	 private double latitudeofpatient;
	 
	 @Column(name="PROBLEM_DESCRIPTION_OF_PATIENT")
	 private String problemdescriptionofpatient;
	 
	 @Column(name="FULL_ADDRESS_OF_PATIENT")
	 private String fulladdressofpatient; 
	 
	 @Column(name="STATUS_VALUE")
	 private String statusvalue;
	 
	 @Column(name="STATUS_DATE_TIME")
	 private Date statusdatetime ;
	 
	 @Column(name="TIME_AND_DATE_OF_APPOINTMENT")
	 private Date timeanddateofappointment ;
	 
	 @Column(name="PAID")
	 private Boolean paid ;
	 
	 @Column(name="APPOINTMENT_TYPE")
	 private String appointmenttype ;
	 
	 @Column(name="APPOINTMENT_TYPE_KEY")
	 private String appointmenttypekey ;
	 
}
