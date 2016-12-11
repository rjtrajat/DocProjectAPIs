package com.cureissure.cis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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


@RestController
public class Controller_one {
	
//	@Autowired
//	RepositoryDoctorTable repositoryDoctorTable;
//	@Autowired
//	RepositoryHospitalTable repositoryHospitalTable;
//	@Autowired
//	RepositoryTestCenterTable repositoryTestCenterTable;
//	@Autowired
//	RepositoryMedicalShopTable repositoryMedicalShopTable;
//	@Autowired
//	RepositoryAppointmentTable repositoryAppointmentTable;
//	


	@RequestMapping(value="/detailDoctor",method=RequestMethod.GET)
	public /*List<DoctorTable>*/ String getDoctorDetail(@RequestParam("Lon")double longitude_user , @RequestParam("Lat") double latitude_user){
		//List<DoctorTable> doctorTablelist = (List<DoctorTable>) repositoryDoctorTable.findAll();
			//return doctor_range_in_list(doctorTablelist,longitude_user,latitude_user);	
		return "Here it is working new repo change change";
	}
//	
//	List<DoctorTable> doctor_range_in_list(List<DoctorTable> doctorTablelist,double longitude_user,double latitude_user){
//		
//		List<DoctorTable> Range_in_doctor_list ;
//		 boolean check ;
//			for(DoctorTable doctortable:doctorTablelist){
//			check = CalculateDistance.IsInRange(longitude_user, latitude_user,doctortable.getLONGITUDE(),doctortable.getLATITUDE());
//			     if(check==true){
//			     //Range_in_doctor_list.add(doctortable);	
//			     }
//		}
//		
//		//return Range_in_doctor_list;
//			return null;
//	}
//	
//	@RequestMapping(value="/detailHospital",method=RequestMethod.GET)
//	public List<HospitalTable> getHospitalDetail(@RequestParam("Lon")double longitude_user , @RequestParam("Lat") double latitude_user){
//		List<HospitalTable> hospitalTablelist = (List<HospitalTable>) repositoryHospitalTable.findAll();	
//		return hospital_range_in_list(hospitalTablelist,longitude_user,latitude_user);	
//	}
//	
//	List<HospitalTable> hospital_range_in_list(List<HospitalTable> hospitalTablelist,double longitude_user,double latitude_user){
//		 List<HospitalTable> Range_in_hospital_list;
//	     boolean check ;
//		for(HospitalTable hospitaltable:hospitalTablelist){
//			check = CalculateDistance.IsInRange(longitude_user, latitude_user,hospitaltable.getLONGITUDE(),hospitaltable.getLATITUDE());
//			     if(check==true){
//			    // Range_in_hospital_list.add(hospitaltable);	
//			     }
//		}
//		
//		//return Range_in_hospital_list;
//		return null;
//	}
//	
//	
//	
//	@RequestMapping(value="/detailTestCenter",method=RequestMethod.GET)
//	public List<TestCenterTable> getTestCenterDetail(@RequestParam("Lon")double longitude_user , @RequestParam("Lat") double latitude_user){
//		List<TestCenterTable> testcenterTablelist = (List<TestCenterTable>) repositoryTestCenterTable.findAll();	
//		return testcenter_range_in_list(testcenterTablelist,longitude_user,latitude_user);
//	}	
//	
//	List<TestCenterTable> testcenter_range_in_list(List<TestCenterTable> testcenterTablelist,double longitude_user,double latitude_user){
//		 List<TestCenterTable> Range_in_testcenter_list;
//	     boolean check ;
//		for(TestCenterTable testcentertable:testcenterTablelist){
//			check = CalculateDistance.IsInRange(longitude_user, latitude_user,testcentertable.getLONGITUDE(),testcentertable.getLATITUDE());
//			     if(check==true){
//			     //Range_in_testcenter_list.add(testcentertable);	
//			     }
//		}
//		//return Range_in_testcenter_list;
//		return null;
//	}
//	
//	@RequestMapping(value="/detailMedicalShop",method=RequestMethod.GET)
//	public  List<MedicalShopTable> getMedicalShop(@RequestParam("Lon")double longitude_user , @RequestParam("Lat") double latitude_user){
//		List<MedicalShopTable> medicalshopTablelist = (List<MedicalShopTable>) repositoryMedicalShopTable.findAll();	
//		return medicalshop_range_in_list(medicalshopTablelist,longitude_user,latitude_user);	
//	}
//	
//	List<MedicalShopTable> medicalshop_range_in_list(List<MedicalShopTable> medicalshopTablelist,double longitude_user,double latitude_user){
//		 List<TestCenterTable> Range_in_testcenter_list;
//	     boolean check ;
//		for(MedicalShopTable medicalshoptable:medicalshopTablelist){
//			check = CalculateDistance.IsInRange(longitude_user, latitude_user,medicalshoptable.getLONGITUDE(),medicalshoptable.getLATITUDE());
//			     if(check==true){
//			     //Range_in_medicalshop_list.add(medicalshoptable);
//			     }
//		}
//		//return Range_in_medicalshop_list;
//		return null;
//	}
//	
//	@RequestMapping(value="/detailSchedule",method=RequestMethod.GET)
//	public AppointmentTable getScheduleDetail(@RequestParam("unique_key_appointment")String unique_key_appointment){
//		AppointmentTable appointmentTable = (AppointmentTable) repositoryAppointmentTable.findByUnique_key_appointment(unique_key_appointment);
//		return appointmentTable;
//	}
//	
//	@RequestMapping(value="/detailIndividualDoctor",method=RequestMethod.GET)
//	public DoctorTable getIndividualDoctorDetail(@RequestParam("cis_doc_id")String cis_doc_id){
//		DoctorTable doctorTable = (DoctorTable) repositoryDoctorTable.findByCis_doc_id(cis_doc_id);
//		return doctorTable;
//	}
//	
//	@RequestMapping(value="/detailIndividualHospital",method=RequestMethod.GET)
//	public HospitalTable getIndividualHospitalDetail(@RequestParam("cis_hos_id")String cis_hos_id){
//		HospitalTable hospitalTable = (HospitalTable) repositoryHospitalTable.findByCis_hos_id(cis_hos_id);
//		return hospitalTable;
//	}
//	
//	@RequestMapping(value="/detailIndividualTestCenter",method=RequestMethod.GET)
//	public TestCenterTable getIndividualTestCenterDetail(@RequestParam("cis_test_id")String cis_test_id){
//		TestCenterTable testcenterTable = (TestCenterTable) repositoryTestCenterTable.findByCis_test_id(cis_test_id);
//		return testcenterTable;
//	}
//	
//	@RequestMapping(value="/detailIndividualMedicalShop",method=RequestMethod.GET)
//	public MedicalShopTable getIndividualMedicalShopDetail(@RequestParam("cis_med_id")String cis_med_id){
//		MedicalShopTable medicalshopcenterTable = (MedicalShopTable) repositoryMedicalShopTable.findByCis_med_id(cis_med_id);
//		return medicalshopcenterTable;
//	}
}
