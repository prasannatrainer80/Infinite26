package com.example.controller;

import com.example.model.UserData;
import com.example.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserDataController {

    @Autowired
    private UserDataService userDataService;

    @PutMapping(value="/updatepassword/{username}/{otp}/{password}")
    public String updatePassword(@PathVariable String username, @PathVariable String otp, @PathVariable String password){
        return  userDataService.updatePassword(username,otp,password);
    }

    @GetMapping(value="/vaidateuser/{username}/{otp}")
    public String validateUser(@PathVariable  String username, @PathVariable String otp){
        return userDataService.validateUser(username,otp);
    }
    @PostMapping(value="/addUserData")
    public String addUser(@RequestBody UserData userData) {
        return userDataService.addUser(userData);
    }
}
