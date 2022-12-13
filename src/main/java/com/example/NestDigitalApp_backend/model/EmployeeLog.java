package com.example.NestDigitalApp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeeLog")
public class EmployeeLog {

    private int id;
    private  String empcode;
    private String date;
    private String entry_datetime;
    private  String exit_datetime;

    public EmployeeLog() {
    }

    public EmployeeLog(int id, String empcode, String date, String entry_datetime, String exit_datetime) {
        this.id = id;
        this.empcode = empcode;
        this.date = date;
        this.entry_datetime = entry_datetime;
        this.exit_datetime = exit_datetime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpcode() {
        return empcode;
    }

    public void setEmpcode(String empcode) {
        this.empcode = empcode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEntry_datetime() {
        return entry_datetime;
    }

    public void setEntry_datetime(String entry_datetime) {
        this.entry_datetime = entry_datetime;
    }

    public String getExit_datetime() {
        return exit_datetime;
    }

    public void setExit_datetime(String exit_datetime) {
        this.exit_datetime = exit_datetime;
    }
}
