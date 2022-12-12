package com.example.NestDigitalApp_backend.dao;

import com.example.NestDigitalApp_backend.model.LeaveCount;
import org.springframework.data.repository.CrudRepository;

public interface LeaveCountDao extends CrudRepository<LeaveCount, Integer> {
}
