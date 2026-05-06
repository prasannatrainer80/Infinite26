package com.example.service;

import com.example.model.Login;
import com.example.repo.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public Login check(String user, String pwd) {
        return loginRepository.findByUsernameAndPasscode(user,pwd);
    }
}
