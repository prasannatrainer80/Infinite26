package com.example.service;

import com.example.model.Employ;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "employ-client", url = "http://localhost:8811")
public interface EmployClient {

    @GetMapping("/showemploy")
    List<Employ> showEmployClient();

    @GetMapping("/searchemploy/{empno}")
    Employ searchByEmpId(@PathVariable("empno") int empno);
}
