package com.cureissure.cis.repository;

import java.util.List;
import com.cureissure.cis.entity.DoctorTable;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

@Component
public interface RepositoryDoctorTable extends CrudRepository<DoctorTable, String> {

	DoctorTable  findByCisdocid(String cisdocid);
}
