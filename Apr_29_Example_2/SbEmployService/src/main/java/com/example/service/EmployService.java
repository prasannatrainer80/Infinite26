package com.example.service;

import com.example.model.Employ;
import com.example.repo.EmployRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployService {

    @Autowired
    private EmployRepository empRepo;

    public List<Employ> showEmploy() {
        return empRepo.findAll();
    }

    public Employ  findEmployById(int id) {
        return empRepo.findById(id).orElse(null);
    }

    public String addEmploy(Employ emp) {
        empRepo.save(emp);
        return "Employ Record Inserted...";
    }

    public String updateEmploy(Employ emp) {
        empRepo.save(emp);
        return "Employ Record Updated...";
    }

    public String deleteEmploy(int empno) {
        empRepo.deleteById(empno);
        return "Employ Record Deleted..";
    }
}
