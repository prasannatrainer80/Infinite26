package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value="/")
    public String hello() {
        return "Welcome to Spring Boot Programming...";
    }

    @GetMapping(value="/company")
    public String company() {
        return "Company is Infinite...";
    }

    @GetMapping(value="/trainer")
    public String trainer() {
        return "Trainer is Prasanna...";
    }

    @GetMapping(value="/showname/{name}")
    public String showname(@PathVariable String name) {
        return "Name is " +name;
    }

    @GetMapping(value="/showinfo/{name}/{company}")
    public String showinfo(@PathVariable String name, @PathVariable String company) {
        return "Name is " +name + " Company is  " +company;
    }
}
