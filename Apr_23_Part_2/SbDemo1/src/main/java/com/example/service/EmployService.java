package com.example.service;

import com.example.model.Employ;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class EmployService {

    static List<Employ> employList = Arrays.asList(
            new Employ(1, "Kaviya",82344),
            new Employ(2, "Mega",90012),
            new Employ(3, "Navin",99111),
            new Employ(4, "Balu",90011),
            new Employ(5, "Dhivya",92343)

    );

    public List<Employ> showEmploy() {
        return employList;
    }

    public Employ findEmployById(int id) {
        return employList.stream().filter(x -> x.getEmpno() == id).findFirst().orElse(null);
    }
}

