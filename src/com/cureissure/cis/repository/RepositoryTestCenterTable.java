package com.cureissure.cis.repository;


import com.cureissure.cis.entity.TestCenterTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface RepositoryTestCenterTable extends CrudRepository<TestCenterTable, String> {
	TestCenterTable  findByCistestid(String cistestid);
}
