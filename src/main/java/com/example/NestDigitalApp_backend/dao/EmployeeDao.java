package com.example.NestDigitalApp_backend.dao;

import com.example.NestDigitalApp_backend.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {

    @Query(value = "SELECT `id`, `designation`, `empcode`, `empname`, `password`, `salary`, `username` FROM `employees` WHERE `username= :username`AND `password`= :password",nativeQuery = true)
    List<Employee> EmployeeLogin(@Param("username") String username, @Param("password") String password);

    @Query(value = "SELECT `id`, `designation`, `empcode`, `empname`, `password`, `salary`, `username` FROM `employees` WHERE `id`= :id",nativeQuery = true)
    List<Employee> FindEmployeeById(@Param("id") Integer id);
}
