package com.example.NestDigitalApp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "visitorLog")
public class VisitorLog {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String purpose;
    private String whomToMeet;
    private String date;
    private String entrytime;
    private String exittime;

    public VisitorLog() {
    }

    public VisitorLog(int id, String name, String purpose, String whomToMeet, String date, String entrytime, String exittime) {
        this.id = id;
        this.name = name;
        this.purpose = purpose;
        this.whomToMeet = whomToMeet;
        this.date = date;
        this.entrytime = entrytime;
        this.exittime = exittime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getWhomToMeet() {
        return whomToMeet;
    }

    public void setWhomToMeet(String whomToMeet) {
        this.whomToMeet = whomToMeet;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(String entrytime) {
        this.entrytime = entrytime;
    }

    public String getExittime() {
        return exittime;
    }

    public void setExittime(String exittime) {
        this.exittime = exittime;
    }
}
