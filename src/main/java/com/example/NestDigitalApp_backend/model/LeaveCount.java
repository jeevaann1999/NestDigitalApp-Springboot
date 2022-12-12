package com.example.NestDigitalApp_backend.model;

import com.sun.jdi.PrimitiveValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leaveCount")
public class LeaveCount {
    @Id
    @GeneratedValue
    private int id;
    private String empcode;
    private String year;
    private String sickleave;
    private  String casualleave;
    private String specialleave;

    public LeaveCount() {
    }

    public LeaveCount(int id, String empcode, String year, String sickleave, String casualleave, String specialleave) {
        this.id = id;
        this.empcode = empcode;
        this.year = year;
        this.sickleave = sickleave;
        this.casualleave = casualleave;
        this.specialleave = specialleave;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSickleave() {
        return sickleave;
    }

    public void setSickleave(String sickleave) {
        this.sickleave = sickleave;
    }

    public String getCasualleave() {
        return casualleave;
    }

    public void setCasualleave(String casualleave) {
        this.casualleave = casualleave;
    }

    public String getSpecialleave() {
        return specialleave;
    }

    public void setSpecialleave(String specialleave) {
        this.specialleave = specialleave;
    }
}
