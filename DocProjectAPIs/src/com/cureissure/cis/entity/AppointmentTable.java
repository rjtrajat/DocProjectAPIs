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
	 private String STATUS_VALUE;
	 private Date TIME_AND_DATE ;
	 private Boolean PAID ;

	
}
