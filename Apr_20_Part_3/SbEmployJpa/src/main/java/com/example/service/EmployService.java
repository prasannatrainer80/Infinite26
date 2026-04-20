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

    public List<Employ> show() {
        return empRepo.findAll();
    }
}
