package com.example.sbemployjpaexs.controller;

import com.example.sbemployjpaexs.model.Employ;
import com.example.sbemployjpaexs.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployController {

    @Autowired
    private EmployService employService;

    @GetMapping(value="/showemploy")
    public List<Employ> showEmploy(){
        return employService.showEmploy();
    }

    @GetMapping(value="/searchEmploy/{empno}")
    public Employ searchEmploy(@PathVariable int empno){
        return employService.findEmployById(empno);
    }

    @PostMapping(value="/addEmploy")
    public String addEmploy(@RequestBody Employ employ){
        return employService.addEmploy(employ);
    }

    @PutMapping(value="/updateEmploy")
    public String updateEmploy(@RequestBody Employ employ){
        return employService.updateEmploy(employ);
    }

    @DeleteMapping(value="/deleteEmploy/{empno}")
    public String deleteEmploy(@PathVariable int empno){
        return employService.deleteEmploy(empno);
    }
}
