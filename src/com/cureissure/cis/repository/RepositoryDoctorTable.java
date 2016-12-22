package com.cureissure.cis.repository;

import com.cureissure.cis.entity.DoctorTable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface RepositoryDoctorTable extends CrudRepository<DoctorTable, String> {

	DoctorTable  findByCisdocid(String cisdocid);
}
