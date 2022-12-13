package com.example.NestDigitalApp_backend.controller;

import com.example.NestDigitalApp_backend.dao.LeaveApplicationDao;
import com.example.NestDigitalApp_backend.model.LeaveApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
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


}
