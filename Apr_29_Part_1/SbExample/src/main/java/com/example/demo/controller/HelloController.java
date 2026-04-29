package com.example.demo.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="/hello")
@RestController
public class HelloController {

	@GetMapping(value="/test")
	public String sayHello() {
		return "Welcome to SpringBoot Programming...";
	}
	
	@GetMapping(value="/greet/{name}")
	public String sayHello(@PathVariable String name) {
		return "Good Morning...!"+name;
	}

	@GetMapping(value="/company")
	public String company() {
		return "Mphasis Client...";
	}
	
	@GetMapping(value="/topic")
	public String topic() {
		return "Spring Boot Intro...";
	}

	@GetMapping(value="/greeting")
	public String greeting() {
		int hr = new Date().getHours();
		if (hr < 12) {
			return "Good Morning...";
		} else if (hr >= 12 && hr < 16) {
			return "Good Afternoon...";
		} else {
			return "Good Evening...";
		}
	}
}
