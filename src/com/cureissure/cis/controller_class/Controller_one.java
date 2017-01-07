package com.cureissure.cis.controller_class;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cureissure.cis.Mail.MailNotification;
import com.cureissure.cis.Range.CalculateDistance;
import com.cureissure.cis.entity.AppointmentTable;
import com.cureissure.cis.entity.DoctorTable;
import com.cureissure.cis.entity.HospitalTable;
import com.cureissure.cis.entity.MedicalShopTable;
import com.cureissure.cis.entity.TestCenterTable;
import com.cureissure.cis.repository.RepositoryAppointmentTable;
import com.cureissure.cis.repository.RepositoryDoctorTable;
import com.cureissure.cis.repository.RepositoryHospitalTable;
import com.cureissure.cis.repository.RepositoryMedicalShopTable;
import com.cureissure.cis.repository.RepositoryTestCenterTable;
import com.google.gson.Gson;

@RestController
public class Controller_one {
	
	@Autowired(required=true)
    RepositoryDoctorTable repositoryDoctorTable;
	@Autowired(required=true)
	RepositoryHospitalTable repositoryHospitalTable;
	@Autowired(required=true)
	RepositoryTestCenterTable repositoryTestCenterTable;
	@Autowired(required=true)
	RepositoryMedicalShopTable repositoryMedicalShopTable;
	@Autowired(required=true)
	RepositoryAppointmentTable repositoryAppointmentTable;
	
	

	@RequestMapping(value="/detailDoctor",method=RequestMethod.GET)
	public String   getDoctorDetail(@RequestParam("Lon")double longitude_user , @RequestParam("Lat") double latitude_user){
		List<DoctorTable> doctorTablelist = (List<DoctorTable>) repositoryDoctorTable.findAll();
		List<DoctorTable> final_Range_in_doctor_list ;
		final_Range_in_doctor_list = doctor_range_in_list(doctorTablelist,longitude_user,latitude_user);
			Gson gson = new Gson();
			return 	gson.toJson(final_Range_in_doctor_list);
	} 
	
	List<DoctorTable> doctor_range_in_list(List<DoctorTable> doctorTablelist,double longitude_user,double latitude_user){
		
		List<DoctorTable> Range_in_doctor_list = new ArrayList<>() ;
		 boolean check ;
			for(DoctorTable doctortable:doctorTablelist){
			check = CalculateDistance.IsInRange(longitude_user, latitude_user,doctortable.getLongitude(),doctortable.getLatitude());
			     if(check==true){
			     Range_in_doctor_list.add(doctortable);	
			     }
		}
		
		return Range_in_doctor_list;
			
	}
	
	@RequestMapping(value="/detailHospital",method=RequestMethod.GET)
	public String getHospitalDetail(@RequestParam("Lon")double longitude_user , @RequestParam("Lat") double latitude_user){
		List<HospitalTable> hospitalTablelist = (List<HospitalTable>) repositoryHospitalTable.findAll();	
		List<HospitalTable> final_Range_in_hospital_list ;
		final_Range_in_hospital_list =  hospital_range_in_list(hospitalTablelist,longitude_user,latitude_user);	
		Gson gson = new Gson();
		return 	gson.toJson(final_Range_in_hospital_list);
	
	
	}
	
	List<HospitalTable> hospital_range_in_list(List<HospitalTable> hospitalTablelist,double longitude_user,double latitude_user){
		 List<HospitalTable> Range_in_hospital_list  = new ArrayList<>() ;
	     boolean check ;
		for(HospitalTable hospitaltable:hospitalTablelist){
			check = CalculateDistance.IsInRange(longitude_user, latitude_user,hospitaltable.getLongitude(),hospitaltable.getLatitude());
			     if(check==true){
			     Range_in_hospital_list.add(hospitaltable);	
			     }
		}
		
		return Range_in_hospital_list;
		
	}
	
	
	
	@RequestMapping(value="/detailTestCenter",method=RequestMethod.GET)
	public  String getTestCenterDetail(@RequestParam("Lon")double longitude_user , @RequestParam("Lat") double latitude_user){
		List<TestCenterTable> testcenterTablelist = (List<TestCenterTable>) repositoryTestCenterTable.findAll();	
		List<TestCenterTable> final_Range_in_testcenter_list ;
		final_Range_in_testcenter_list = testcenter_range_in_list(testcenterTablelist,longitude_user,latitude_user);
		Gson gson = new Gson();
		return 	gson.toJson(final_Range_in_testcenter_list);
		
}	
	
	List<TestCenterTable> testcenter_range_in_list(List<TestCenterTable> testcenterTablelist,double longitude_user,double latitude_user){
		 List<TestCenterTable> Range_in_testcenter_list = new ArrayList<>();
	     boolean check ;
		for(TestCenterTable testcentertable:testcenterTablelist){
			check = CalculateDistance.IsInRange(longitude_user, latitude_user,testcentertable.getLongitude(),testcentertable.getLatitude());
			     if(check==true){
			     Range_in_testcenter_list.add(testcentertable);	
			     }
		}
		return Range_in_testcenter_list;
		
	}
	
	@RequestMapping(value="/detailMedicalShop",method=RequestMethod.GET)
	public   String getMedicalShop(@RequestParam("Lon")double longitude_user , @RequestParam("Lat") double latitude_user){
		List<MedicalShopTable> medicalshopTablelist = (List<MedicalShopTable>) repositoryMedicalShopTable.findAll();	
		List<MedicalShopTable> final_Range_in_medicalshoop_list ;
		final_Range_in_medicalshoop_list =  medicalshop_range_in_list(medicalshopTablelist,longitude_user,latitude_user);	
		Gson gson = new Gson();
		return 	gson.toJson(final_Range_in_medicalshoop_list);
	
	}
	
	List<MedicalShopTable> medicalshop_range_in_list(List<MedicalShopTable> medicalshopTablelist,double longitude_user,double latitude_user){
		 List<MedicalShopTable> Range_in_medicalshop_list = new ArrayList<>();
	     boolean check ;
		for(MedicalShopTable medicalshoptable:medicalshopTablelist){
			check = CalculateDistance.IsInRange(longitude_user, latitude_user,medicalshoptable.getLongitude(),medicalshoptable.getLatitude());
			     if(check==true){
			    	 Range_in_medicalshop_list.add(medicalshoptable);
			     }
		}
		return Range_in_medicalshop_list;
		
	}
	
	@RequestMapping(value="/detailSchedule",method=RequestMethod.GET)
	public String getScheduleDetail(@RequestParam("unique_key_appointment")String unique_key_appointment){
		AppointmentTable appointmentTable = (AppointmentTable) repositoryAppointmentTable.findByUniquekeyappointment(unique_key_appointment);
		Gson gson = new Gson();
		return 	gson.toJson(appointmentTable);
		
	}
	
	@RequestMapping(value="/detailIndividualDoctor",method=RequestMethod.GET)
	public DoctorTable getIndividualDoctorDetail(@RequestParam("cis_doc_id")String cis_doc_id){
		DoctorTable doctorTable = (DoctorTable) repositoryDoctorTable.findByCisdocid(cis_doc_id);
		return doctorTable;
	}
	
	@RequestMapping(value="/detailIndividualHospital",method=RequestMethod.GET)
	public String getIndividualHospitalDetail(@RequestParam("cis_hos_id")String cis_hos_id){
		HospitalTable hospitalTable = (HospitalTable) repositoryHospitalTable.findByCishosid(cis_hos_id);
		Gson gson = new Gson();
		return 	gson.toJson(hospitalTable);
	}
	
	@RequestMapping(value="/detailIndividualTestCenter",method=RequestMethod.GET)
	public String getIndividualTestCenterDetail(@RequestParam("cis_test_id")String cis_test_id){
		TestCenterTable testcenterTable = (TestCenterTable) repositoryTestCenterTable.findByCistestid(cis_test_id);
		Gson gson = new Gson();
		return 	gson.toJson(testcenterTable);
	}
	
	@RequestMapping(value="/detailIndividualMedicalShop",method=RequestMethod.GET)
	public String getIndividualMedicalShopDetail(@RequestParam("cis_med_id")String cis_med_id){
		MedicalShopTable medicalshopcenterTable = (MedicalShopTable) repositoryMedicalShopTable.findByCismedid(cis_med_id);
		Gson gson = new Gson();
		return 	gson.toJson(medicalshopcenterTable);
	}
	
	@RequestMapping(value="/detailIndividualDoctorAppoint",method=RequestMethod.GET)
	public DoctorTable getIndividualDoctorAppointDetail(@RequestParam("cis_doc_id")String cis_doc_id){
		DoctorTable doctorTable = (DoctorTable) repositoryDoctorTable.findByCisdocid(cis_doc_id);
		return doctorTable;
	}
	
	@RequestMapping(value="/detailIndividualHospitalAppoint",method=RequestMethod.GET)
	public String getIndividualHospitalAppointDetail(@RequestParam("cis_hos_id")String cis_hos_id){
		HospitalTable hospitalTable = (HospitalTable) repositoryHospitalTable.findByCishosid(cis_hos_id);
		Gson gson = new Gson();
		return 	gson.toJson(hospitalTable);
	}
	
	@RequestMapping(value="/detailIndividualTestCenterAppoint",method=RequestMethod.GET)
	public String getIndividualTestCenterAppointDetail(@RequestParam("cis_test_id")String cis_test_id){
		TestCenterTable testCenterTable = (TestCenterTable) repositoryTestCenterTable.findByCistestid(cis_test_id);
		Gson gson = new Gson();
		return 	gson.toJson(testCenterTable);
	}
	
	@RequestMapping(value="/latestUniquePatientKey",method=RequestMethod.GET)
	public String getLatestUniquePatientKey(){
		
		List<AppointmentTable>  appointmentTableList = (List<AppointmentTable>)repositoryAppointmentTable.findAll();
		AppointmentTable appointmentTable = new AppointmentTable();
		String unique;
		Long tempcount;
		Long returncount  = 0L;
		for(AppointmentTable appointment :appointmentTableList){
			unique= appointment.getUniquekeyappointment();
			String newunique=unique.replace("PATIENT_KEY_","");
			tempcount = Long.parseLong(newunique);
			if(tempcount>returncount){
				returncount = tempcount;
				appointmentTable = appointment;
			}
		}
		
		
		Gson gson = new Gson();
		return 	gson.toJson(appointmentTable);
	}
	@SuppressWarnings("deprecation")
	@RequestMapping(value="/patientDetailentry",method=RequestMethod.GET)
	public String setPatientDetailentry(@RequestParam("uniquekeyappointment") String uniquekeyappointment,@RequestParam("nameofpatient") String nameofpatient,@RequestParam("contactofpatient") String contactofpatient,@RequestParam("mailidofpatient") String mailidofpatient,@RequestParam("longitudeofpatient") Double longitudeofpatient,@RequestParam("latitudeofpatient") Double latitudeofpatient,@RequestParam("problemdescriptionofpatient") String problemdescriptionofpatient,@RequestParam("fulladdressofpatient") String fulladdressofpatient,@RequestParam("statusvalue") String statusvalue,@RequestParam("statusdatetime") String statusdatetime,@RequestParam("dateofappointment")  String dateofappointment,@RequestParam("timeofappointment") String timeofappointment,@RequestParam("paid") Boolean paid,@RequestParam("appointmenttype") String appointmenttype,@RequestParam("appointmenttypekey") String appointmenttypekey)throws Exception{
		String Statusdatetime = statusdatetime;
		String Timeanddateofappointment = dateofappointment+" "+timeofappointment;
		DateFormat parser = new SimpleDateFormat("dd-MM-yyyy"); 
		Date datestatus ;
		Date dateappoint ;

		 datestatus = (Date) parser.parse(Statusdatetime);
		 parser = new SimpleDateFormat("dd-MM-yyyy HH:mm"); 
		 dateappoint = (Date) parser.parse(Timeanddateofappointment);
	
		
		AppointmentTable appointmentTable = new AppointmentTable();
		appointmentTable.setUniquekeyappointment(uniquekeyappointment);
		appointmentTable.setNameofpatient(nameofpatient);
		appointmentTable.setContactofpatient(contactofpatient);
		appointmentTable.setMailidofpatient(mailidofpatient);
		appointmentTable.setLongitudeofpatient(longitudeofpatient);
		appointmentTable.setLatitudeofpatient(latitudeofpatient);
		appointmentTable.setProblemdescriptionofpatient(problemdescriptionofpatient);
		appointmentTable.setFulladdressofpatient(fulladdressofpatient);
		appointmentTable.setStatusvalue(statusvalue);
		appointmentTable.setStatusdatetime(datestatus);
		appointmentTable.setTimeanddateofappointment(dateappoint);
		appointmentTable.setPaid(paid);
		appointmentTable.setAppointmenttype(appointmenttype);
		appointmentTable.setAppointmenttypekey(appointmenttypekey);
		repositoryAppointmentTable.save(appointmentTable);
		
		appointmentTable = (AppointmentTable) repositoryAppointmentTable.findTopByOrderByUniquekeyappointmentDesc();
		Gson gson = new Gson();
		return 	gson.toJson(appointmentTable);
	}
	
	@RequestMapping(value="/MailDocHosTestMed",method=RequestMethod.GET)
	public void sendMailDocHosTestMed(@RequestParam("name") String name,@RequestParam("mail") String mail,@RequestParam("contact") String contact,@RequestParam("experience_month") String experience_month,@RequestParam("experience_year") String experience_year,@RequestParam("typeRegister") String typeRegister)throws Exception{
		
		 MailNotification.sendMailDocHosTestMedClass(name, mail, contact, experience_month, experience_year,typeRegister);
	}
	
	@RequestMapping(value="/MailPatient",method=RequestMethod.GET)
	public void sendMailPatient(@RequestParam("uniquekeyappointmentGlobal") String uniquekeyappointmentGlobal,@RequestParam("nameofpatientGlobal") String nameofpatientGlobal,@RequestParam("contactofpatientGlobal") String contactofpatientGlobal,@RequestParam("mailidofpatientGlobal") String mailidofpatientGlobal,@RequestParam("problemdescriptionofpatientGlobal") String problemdescriptionofpatientGlobal,@RequestParam("fulladdressofpatientGlobal") String fulladdressofpatientGlobal,@RequestParam("statusvalueGlobal") String statusvalueGlobal,@RequestParam("dateofappointmentGlobal") String dateofappointmentGlobal,@RequestParam("timeofappointmentGlobal") String timeofappointmentGlobal,@RequestParam("appointmenttypeGlobal") String appointmenttypeGlobal,@RequestParam("appointmenttypekeyGlobal") String appointmenttypekeyGlobal,@RequestParam("DocHosTestNameGlobal") String DocHosTestNameGlobal,@RequestParam("DocHosTestAboutGlobal") String DocHosTestAboutGlobal,@RequestParam("DocHosTestAddressGlobal") String DocHosTestAddressGlobal,@RequestParam("DocHosTestExperienceGlobal") String DocHosTestExperienceGlobal,@RequestParam("DocHosTestMail_idGlobal") String DocHosTestMail_idGlobal,@RequestParam("DocHosTestMobile_NoGlobal") String DocHosTestMobile_NoGlobal,@RequestParam("DocHosTestSpecializationGlobal") String DocHosTestSpecializationGlobal){
		 MailNotification.sendMailPatientClass(uniquekeyappointmentGlobal, nameofpatientGlobal, contactofpatientGlobal, mailidofpatientGlobal, problemdescriptionofpatientGlobal, fulladdressofpatientGlobal, statusvalueGlobal, dateofappointmentGlobal, timeofappointmentGlobal, appointmenttypeGlobal, appointmenttypekeyGlobal, DocHosTestNameGlobal, DocHosTestAboutGlobal, DocHosTestAddressGlobal, DocHosTestExperienceGlobal, DocHosTestMail_idGlobal, DocHosTestMobile_NoGlobal, DocHosTestSpecializationGlobal);	
	}
}
