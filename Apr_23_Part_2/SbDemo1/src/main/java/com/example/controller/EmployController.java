package com.example.controller;

import com.example.model.Employ;
import com.example.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployController {

    @Autowired
    private EmployService employService;

    @GetMapping(value="/employshow")
    public List<Employ> showEmploy() {
        return employService.showEmploy();
    }

    @GetMapping(value="/searchemploy/{empno}")
    public Employ searchEmploy(@PathVariable int empno) {
        return employService.findEmployById(empno);
    }
}
