package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/calc")
public class CalculationController {

	@GetMapping(value="/sum/{a}/{b}")
	public String sum(@PathVariable int a, 
			 @PathVariable int b) {
		int c = a + b;
		String res="";
		res+=c;
		return res;
	}

}
