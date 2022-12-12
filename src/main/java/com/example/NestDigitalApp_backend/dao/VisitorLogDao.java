package com.example.NestDigitalApp_backend.dao;

import com.example.NestDigitalApp_backend.model.VisitorLog;
import org.springframework.data.repository.CrudRepository;

public interface VisitorLogDao extends CrudRepository<VisitorLog, Integer> {
}
