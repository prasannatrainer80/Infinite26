package com.example.controller;

import com.example.model.Employ;
import com.example.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployController {

    @Autowired
    private EmployService empService;

    @DeleteMapping(value="/deleteemploy/{empno}")
    public ResponseEntity<String> deleteEmploy(int empno) {
        String result = empService.deleteEmploy(empno);
        return new ResponseEntity<>(result,HttpStatus.OK);
    }
    @PostMapping(value="/updateemploy")
    public ResponseEntity<String> updateEmploy(@RequestBody Employ employ){
        String result = empService.updateEmploy(employ);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping(value="/addemploy")
    public ResponseEntity<String> addEmploy(@RequestBody Employ employ){
        String result = empService.addEmploy(employ);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping(value="/searchemploy/{empno}")
    public ResponseEntity<Employ> searchEmploy(@PathVariable int empno){
        return new ResponseEntity<>(empService.searchEmploy(empno), HttpStatus.OK);
    }

    @GetMapping(value="/showemploy")
    public ResponseEntity<List<Employ>> showEmploy() {
        return new ResponseEntity<>(empService.showEmploy(), HttpStatus.OK);
    }
}
