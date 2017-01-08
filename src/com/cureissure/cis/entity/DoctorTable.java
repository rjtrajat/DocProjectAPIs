
package com.cureissure.cis.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Data
@Table(name="doctor_table")
@Component
public class DoctorTable {

 @Id
 @Column(name="CIS_DOC_ID")
 private String cisdocid;
 
 @Column(name="LONGITUDE")
 private double longitude;
 
 @Column(name="LATITUDE")
 private double latitude;
 
 @Column(name="FULL_ADDRESS")
 private String fulladdress;
 
 @Column(name="ABOUT_DOCTOR")
 private String aboutdoctor ;
 
 @Column(name="MAIL_ID")
 private String mailid ;
 
 @Column(name="CONTACT")
 private String contact;
 
 @Column(name="EXPERIENCE")
 private Date experience;
 
 @Column(name="SPECIALIZATION")
 private String specialization;
 
 @Column(name="DOCTOR_NAME")
 private String doctorname;
 
 @Column(name="FEES")
 private String fees; 
 
 @Column(name="DAYS_CLOSED")
 private String daysclosed; 
 
 @Column(name="OPEN_TIME")
 private String opentime; 

}