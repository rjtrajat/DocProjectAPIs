package com.cureissure.cis.repository;

import com.cureissure.cis.entity.MedicalShopTable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface RepositoryMedicalShopTable extends CrudRepository<MedicalShopTable, String> {
	MedicalShopTable  findByCismedid(String cismedid);
}
