
package com.cureissure.cis.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="doctor_table")
public class DoctorTable {

 @Id
 private String CIS_DOC_ID;
 private Long LONGITUDE;
 private Long LATITUDE;
 private String FULL_ADDRESS;
 private String ABOUT_DOCTOR ;
 private String MAIL_ID ;
 private String CONTACT;
 private Date EXPERIENCE;
 private String SPECIALIZATION;
 private String DOCTOR_NAME;

}