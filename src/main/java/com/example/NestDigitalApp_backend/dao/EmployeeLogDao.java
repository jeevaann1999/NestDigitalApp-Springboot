package com.example.NestDigitalApp_backend.dao;

import com.example.NestDigitalApp_backend.model.EmployeeLog;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeLogDao extends CrudRepository<EmployeeLog, Integer> {
}
