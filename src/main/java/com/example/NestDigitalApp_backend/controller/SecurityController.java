package com.example.NestDigitalApp_backend.controller;

import com.example.NestDigitalApp_backend.dao.SecurityDao;
import com.example.NestDigitalApp_backend.model.Employee;
import com.example.NestDigitalApp_backend.model.Security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SecurityController {

    @Autowired
    private SecurityDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/securitylogin",consumes = "application/json", produces = "application/json")
    public HashMap<String, String> UserLogin(@RequestBody Security s){
        System.out.println(s.getUsername());
        List<Security> result=(List<Security>) dao.SecurityLogin(s.getUsername(),s.getPassword());
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
            hm.put("message", "security login success");
        }
        return hm;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addsecurity", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> AddSecurity(@RequestBody Security s){
        System.out.println(s.getName().toString());
        System.out.println(s.getEmpcode().toString());
        System.out.println(s.getUsername().toString());
        System.out.println(s.getPassword().toString());
        dao.save(s);
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewsecurity")
    public List<Security> ViewAllSecurity() {
        return (List<Security>) dao.findAll();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/searchsecurity",consumes = "application/json",produces = "application/json")
    public List<Security> SecuritySearch(@RequestBody Security s)
    {
        String empcode=String.valueOf(s.getEmpcode());
        System.out.println(empcode);
        return (List<Security>) dao.SecuritySearch(s.getEmpcode());
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/deletesecurity",consumes = "application/json", produces = "application/json")
    public Map<String,String> DeleteSecurity(@RequestBody Security s)
    {
        String id=String.valueOf(s.getId());
        System.out.println(id);
        dao.DeleteSecurity(s.getId());
        HashMap<String,String> map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/securityById",consumes = "application/json",produces = "application/json")
    public List<Security> GetSecurityById(@RequestBody Security s)
    {
        return (List<Security>) dao.FindSecurityById(s.getId());
    }



}
