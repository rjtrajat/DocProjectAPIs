package com.cureissure.cis.repository;

import java.util.List;
import com.cureissure.cis.entity.MedicalShopTable;
import com.cureissure.cis.entity.TestCenterTable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface RepositoryMedicalShopTable extends CrudRepository<MedicalShopTable, String> {
	MedicalShopTable  findByCismedid(String cismedid);
}
