package com.cureissure.cis.repository;

import java.util.List;
import com.cureissure.cis.entity.AppointmentTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface RepositoryAppointmentTable extends CrudRepository<AppointmentTable, String> {
AppointmentTable findByUnique_key_appointment(String unique_key_appointment);
}
