package com.example.NestDigitalApp_backend.controller;

import com.example.NestDigitalApp_backend.dao.EmployeeLogDao;
import com.example.NestDigitalApp_backend.dao.VisitorLogDao;
import com.example.NestDigitalApp_backend.model.EmployeeLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LogController {

    @Autowired
    private VisitorLogDao d;

    @Autowired
    private EmployeeLogDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/emplog",consumes = "application/json",produces = "application/json")
    public Map<String,String> EmployLog(@RequestBody EmployeeLog l)
    {
        System.out.println(l.getEmpcode().toString());
        System.out.println(l.getDate().toString());
        System.out.println(l.getEntry_datetime().toString());
        System.out.println(l.getExit_datetime().toString());
        dao.save(l);
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/viewallemplog")
    public List<EmployeeLog> ViewAllEMpLog()
    {
        return (List<EmployeeLog>) dao.findAll();
    }






}
