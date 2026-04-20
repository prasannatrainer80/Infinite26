package com.example.controller;

import com.example.model.Employ;
import com.example.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployController {

    @Autowired
    private EmployService employService;

    @GetMapping(value="/")
    public String showEmploy(Model model) {
        model.addAttribute("employList", employService.show());
        return "employshow";
    }
}
