package com.example.service;

import com.example.model.UserData;
import com.example.repo.UserDataRepository;
import com.example.util.EntryptPassword;
import com.example.util.OtpGenerate;
import com.example.util.SendMail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDataService {

    @Autowired
    private UserDataRepository userRepository;

    public String validateUser(String userName, String otp) {
        UserData userData = userRepository.findByUserName(userName);
        System.out.println(userData);
        if (userData != null) {
            if (otp.equals(userData.getOtp())) {
                return "1";
            }
        }
        return "0";
    }

    public String updatePassword(String userName, String otp, String newPass) {
        String res = validateUser(userName, otp);
        if (res.equals("1")) {
            String encr = EntryptPassword.getCode(newPass);
            UserData userData = userRepository.findByUserName(userName);
            userData.setPassWord(encr);
            userData.setStatus("True");
            userRepository.save(userData);
            return "Password Created and Stored...";
        }
        return "Invalid Inputs...";
    }
    public String addUser(UserData userData) {
        int otp = OtpGenerate.generateOtp();
        String otpfinal="";
        otpfinal+=otp;
        userData.setOtp(otpfinal);
        userData.setStatus("false");
        userRepository.save(userData);
        String res="";
        res+="Your Account will Active after giving below Otp " +otpfinal;
        SendMail.mailSend(userData.getEmail(),"Otp Generated",res);
        return "User Added and Otp Shared by Email...";
    }
}
