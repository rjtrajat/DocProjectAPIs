package com.cureissure.cis.repository;

import java.util.List;

import com.cureissure.cis.entity.HospitalTable;
import com.cureissure.cis.entity.TestCenterTable;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryTestCenterTable extends CrudRepository<TestCenterTable, String> {
	TestCenterTable  findByCis_test_id(String cis_test_id);
}
