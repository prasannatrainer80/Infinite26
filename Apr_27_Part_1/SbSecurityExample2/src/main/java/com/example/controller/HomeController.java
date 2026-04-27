package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value="/home")
    public String home() {
        return "This is Home Controller Page...";
    }

    @GetMapping(value="/delete")
    public String delete() {
        return "This is Delete Controller Page...";
    }
}
