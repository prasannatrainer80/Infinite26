package com.example.controller;

import com.example.model.Employ;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployController {

    @PostMapping(value="/save")
    public String save(@Valid @ModelAttribute("employ") Employ employ,
                       BindingResult result, Model model
                       ){
        if (result.hasErrors()) {
            return "/home";
        }
        model.addAttribute("result","All Validations are Clear...");
        return "success";
    }

    @GetMapping(value="/home")
    public String homepage(Model model) {
        model.addAttribute("employ",new Employ());
        return "home";
    }

    @GetMapping(value="/")
    public String home(Model model) {
        model.addAttribute("employ",new Employ());
        return "home";
    }
}
