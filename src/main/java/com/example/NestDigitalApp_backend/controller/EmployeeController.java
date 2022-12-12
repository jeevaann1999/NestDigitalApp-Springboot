package com.example.NestDigitalApp_backend.controller;


import com.example.NestDigitalApp_backend.dao.EmployeeDao;
import com.example.NestDigitalApp_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/emplogin",consumes = "application/json", produces = "application/json")
    public HashMap<String, String> UserLogin(@RequestBody Employee e){
        System.out.println(e.getUsername());
        List<Employee> result=(List<Employee>) dao.UserLogin(e.getUsername(),e.getPassword());
        System.out.println(result);
        HashMap<String,String> hm=new HashMap<>();
        if(result.size()==0) {
            hm.put("status", "failed");
            hm.put("message", "user doesn't exist");
        }
        else {
            int id =result.get(0).getId();
            hm.put("userId",String.valueOf(id));
            hm.put("status", "success");
            hm.put("message", "user login success");
        }
        return hm;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addemp", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> UserRegistration(@RequestBody Employee e){
        System.out.println(e.getEmpname().toString());
        System.out.println(e.getEmpcode().toString());
        System.out.println(e.getDesignation().toString());
        System.out.println(e.getSalary());
        System.out.println(e.getUsername().toString());
        System.out.println(e.getPassword().toString());
        dao.save(e);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/UserById",consumes = "application/json",produces = "application/json")
    public List<Employee> GetUserById(@RequestBody Employee u)
    {
        return (List<Employee>) dao.FindUserById(u.getId());
    }


}
