package com.cureissure.cis.repository;

import java.util.List;
import com.cureissure.cis.entity.MedicalShopTable;
import com.cureissure.cis.entity.TestCenterTable;

import org.springframework.data.repository.CrudRepository;

public interface RepositoryMedicalShopTable extends CrudRepository<MedicalShopTable, String> {
	MedicalShopTable  findByCis_med_id(String cis_med_id);
}
