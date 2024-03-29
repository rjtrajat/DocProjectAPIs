package com.cureissure.cis.repository;

import com.cureissure.cis.entity.AppointmentTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface RepositoryAppointmentTable extends CrudRepository<AppointmentTable, String> {
AppointmentTable findByUniquekeyappointment(String uniquekeyappointment);
AppointmentTable findTopByOrderByUniquekeyappointmentDesc();
}
