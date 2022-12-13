package com.example.NestDigitalApp_backend.dao;

import com.example.NestDigitalApp_backend.model.LeaveApplication;
import org.springframework.data.repository.CrudRepository;

public interface LeaveApplicationDao extends CrudRepository<LeaveApplication,Integer> {
}
