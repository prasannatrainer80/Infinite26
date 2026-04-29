package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployDao;
import com.example.demo.model.Employ;

@RestController
@RequestMapping(value="/employ")
public class EmployController {

	@Autowired
	private EmployDao employDao;

	@GetMapping(value="/showemploy")
	public List<Employ> showEmploy() {
		return employDao.showEmploy();
	}
	
	@GetMapping(value="/searchemploy/{empno}")
	public Employ searchEmploy(@PathVariable int empno) {
		return employDao.searchEmploy(empno);
	}
	
	@PostMapping(value="/addemploy")
	public String addEmploy(@RequestBody Employ employ) {
		return employDao.addEmploy(employ);
	}
	
	@PutMapping(value="/updateemploy")
	public String updateEmploy(@RequestBody Employ employ) {
		return employDao.updateEmploy(employ);
	}

	@DeleteMapping(value="/deleteemploy/{empno}")
	public String deleteEmploy(@PathVariable int empno) {
		return employDao.deleteEmploy(empno);
	}
}
