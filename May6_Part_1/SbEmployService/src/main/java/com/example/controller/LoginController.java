package com.example.controller;

import com.example.model.Login;
import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping(value="/login/{username}/{passcode}")
    public String login(@PathVariable String username,@PathVariable String passcode){
        Login login = loginService.check(username,passcode);
        if (login!=null) {
            return "1";
        }
        return "0";
    }
}
