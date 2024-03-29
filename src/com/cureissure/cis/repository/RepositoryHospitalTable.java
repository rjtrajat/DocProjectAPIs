package com.cureissure.cis.repository;


import com.cureissure.cis.entity.HospitalTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface RepositoryHospitalTable extends CrudRepository<HospitalTable, String> {
	HospitalTable  findByCishosid(String cishosid);
}
