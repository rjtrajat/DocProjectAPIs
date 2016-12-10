package com.cureissure.cis.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;
import lombok.*;

@Entity
@Data
@Table(name="appointment_table")
public class AppointmentTable {

	 @Id
	 private String UNIQUE_KEY_APPOINTMENT;
	 private String NAME_OF_PATIENT;
	 private String CONTACT_OF_PATIENT;
	 private String MAIL_ID_OF_PATIENT;
	 private double LONGITUDE_OF_PATIENT;
	 private double LATITUDE_OF_PATIENT;
	 private String PROBLEM_DESCRIPTION_OF_PATIENT;
	 private String FULL_ADDRESS_OF_PATIENT; 
	 private String STATUS_VALUE;
	 private Date STATUS_DATE_TIME ;
	 private Date TIME_AND_DATE_OF_APPOINTMENT ;
	 private Boolean PAID ;
	 

	
}
