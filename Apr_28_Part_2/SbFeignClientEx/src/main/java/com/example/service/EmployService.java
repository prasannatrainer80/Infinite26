package com.example.service;

import com.example.model.Employ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployService {

    @Autowired
    private EmployClient employClient;

    public List<Employ> showEmployClient() {
        return employClient.showEmployClient();
    }

    public Employ searchByEmpId(int empno) {
        return employClient.searchByEmpId(empno);
    }

}

