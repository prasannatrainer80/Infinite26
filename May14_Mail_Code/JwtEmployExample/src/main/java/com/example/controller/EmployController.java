package com.example.controller;

import java.util.List;

import com.example.config.JwtService;
import com.example.config.SendMail;
import com.example.model.AuthRequest;
import com.example.model.Employ;
import com.example.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/employ")
@CrossOrigin(origins = "*")
public class EmployController {

	@Autowired
	private EmployService service;
	
	@Autowired
	private JwtService jwtService;
	
    @Autowired
    private AuthenticationManager authenticationManager;
	
	@GetMapping(value="/showEmploy")
	public List<Employ> showEmploy() {
		return service.showEmployDao();
	}
	
	@GetMapping(value="/searchEmploy/{id}")
	public Employ searchEmploy(@PathVariable int id) {
		return service.searchEmploy(id);
	}
	
	@PostMapping(value="/addEmploy")
	public String addEmploy(@RequestBody Employ employ) {
		return service.addEmployDao(employ);
	}

	@PutMapping(value="/updateEmploy")
	public String updateEmploy(@RequestBody Employ employ) {
		return service.updateEmployDao(employ);
	}
	
	@DeleteMapping(value="/deleteEmploy/{id}")
	public String deleteEmploy(@PathVariable int id) {
		return service.deleteEmployDao(id);
	}
	
	 @PostMapping("/generateToken")
	    public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
	        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
	        if (authentication.isAuthenticated()) {
				SendMail.mailSend("naveennsd1515@gmail.com","Demo Java","First Mail...Infinite Batch");
	            return jwtService.generateToken(authRequest.getUsername());
	        } else {
	            throw new UsernameNotFoundException("invalid user request !");
	        }
	    }
}
