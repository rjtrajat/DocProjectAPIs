package com.cureissure.cis.repository;

import java.util.List;

import com.cureissure.cis.entity.DoctorTable;
import com.cureissure.cis.entity.HospitalTable;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryHospitalTable extends CrudRepository<HospitalTable, String> {
	HospitalTable  findByCis_hos_id(String cis_hos_id);
}
