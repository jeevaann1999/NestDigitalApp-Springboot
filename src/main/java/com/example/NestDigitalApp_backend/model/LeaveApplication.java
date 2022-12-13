package com.example.NestDigitalApp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leaveApplication")
public class LeaveApplication {

    @Id
    @GeneratedValue
    private int id;
    private String empcode;
    private String leavetype;
    private String remarks;
    private String fromDate;
    private String toDate;
    private String status;

    public LeaveApplication() {
    }

    public LeaveApplication(int id, String empcode, String leavetype, String remarks, String fromDate, String toDate, String status) {
        this.id = id;
        this.empcode = empcode;
        this.leavetype = leavetype;
        this.remarks = remarks;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.status = status;
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

    public String getLeavetype() {
        return leavetype;
    }

    public void setLeavetype(String leavetype) {
        this.leavetype = leavetype;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
