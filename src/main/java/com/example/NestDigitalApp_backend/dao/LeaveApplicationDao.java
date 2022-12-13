package com.example.NestDigitalApp_backend.dao;

import com.example.NestDigitalApp_backend.model.Employee;
import com.example.NestDigitalApp_backend.model.LeaveApplication;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface LeaveApplicationDao extends CrudRepository<LeaveApplication,Integer> {

    @Query(value = "SELECT e.`designation`, e.`empcode`, e.`empname`, l.leavetype,l.from_date,l.to_date,l.status FROM `employees` e JOIN leave_application l ON e.empcode=l.empcode",nativeQuery = true)
    List<Map<String,String>> ViewAllLeave();

    @Modifying
    @Transactional
    @Query(value = "UPDATE `leave_application` SET `status`= :status WHERE `empcode`= :empcode",nativeQuery = true)
    void UpdateStatus(@Param("empcode") String empcode, @Param("status") String status);

    @Query(value = "SELECT  l.`empcode`, l.`from_date`, l.`leavetype`, l.`remarks`, l.`status`, l.`to_date` FROM `leave_application`l JOIN employees e ON l.`empcode`=e.empcode",nativeQuery = true)
    List<Map<String,String>> LeaveById(@Param("id") Integer id);
}
