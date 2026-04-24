package com.example.service;

import com.example.exception.EmployNoAlreadyExistsException;
import com.example.exception.ResourceNotFoundException;
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

    public String deleteEmploy(int empno) {
        Employ employ = empRepo.findById(empno).orElseThrow(()-> new ResourceNotFoundException("Employee with id " + empno + " not found"));
        empRepo.delete(employ);
        return "Employee with id " + empno + " deleted";
    }

    public String updateEmploy(Employ employ) {
        if (!empRepo.existsById(employ.getEmpno())) {
            throw new ResourceNotFoundException("Employee Not Found with Id " +employ.getEmpno());
        }
        empRepo.save(employ);
        return "Employ Record Updated...";
    }

    public String addEmploy(Employ emp) {
        Employ employ = empRepo.findById(emp.getEmpno()).get();
        if (employ !=null) {
            throw new EmployNoAlreadyExistsException("Employ No Already Exists  " +employ.getEmpno());
        }
         empRepo.save(emp);
         return "*** Employ Record Inserted ***";
    }
    public Employ searchEmploy(int empno) {
        return empRepo.findById(empno).orElseThrow( () ->
                new ResourceNotFoundException("Employ No Not Found With Id  " +empno));
    }
}
