package com.example.NestDigitalApp_backend.controller;

import com.example.NestDigitalApp_backend.dao.LeaveApplicationDao;
import com.example.NestDigitalApp_backend.model.Employee;
import com.example.NestDigitalApp_backend.model.LeaveApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
public class LeaveApplicationController {
    @Autowired
    private LeaveApplicationDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path ="/leaveapply",produces = "application/json",consumes = "application/json")
    public Map<String,String> ApplyLeave(@RequestBody LeaveApplication l) {
        dao.save(l);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewallleave")
    public List<Map<String,String>> ViewAllLeaveByEmpcode()
    {
        return (List<Map<String, String>>) dao.ViewAllLeave();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/update",consumes = "application/json",produces = "application/json")
    public Map<String,String> UpdateStatus(@RequestBody LeaveApplication l)
    {
        String empcode=String.valueOf(l.getEmpcode());
        String status=l.getStatus().toString();
        System.out.println(empcode);
        System.out.println(status);
        dao.UpdateStatus(l.getEmpcode(),l.getStatus());
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/leavebyid",consumes = "application/json",produces = "application/json")
    public String LeaveById(){
        return "leave by id";
    }

    }



