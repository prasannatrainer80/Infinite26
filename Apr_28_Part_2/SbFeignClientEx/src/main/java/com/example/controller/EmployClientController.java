package com.example.controller;

import com.example.model.Employ;
import com.example.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployClientController {

    @Autowired
    private EmployService employService;

    @GetMapping(value="/showemploy")
    public List<Employ> showEmployClient() {
        return employService.showEmployClient();
    }

    @GetMapping(value="/searchemploy/{empno}")
    public Employ searchEmployClient(@PathVariable int empno) {
        return employService.searchByEmpId(empno);
    }
}
