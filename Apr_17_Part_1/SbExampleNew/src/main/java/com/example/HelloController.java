package com.example;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @GetMapping(value="/logincheck")
    public String logincheck(Model model, HttpServletRequest request) {
        String userName = request.getParameter("userName");
        String passCode = request.getParameter("passCode");
        if (userName.equals("Infinite") && passCode.equals("Infinite")) {
            return "menu";
        }
        else {
            model.addAttribute("error", "Please Enter Valid Credentials...");
            return "login";
        }
    }

    @GetMapping(value="/login")
    public String login(){
        return "login";
    }
    @GetMapping(value="/calcinput")
    public String calcinput(){
        return "calcinput";
    }

    @GetMapping(value="/calcresult")
    public String calcresult(Model model,HttpServletRequest request){
        int firstNo, secondNo, result;
        firstNo = Integer.parseInt(request.getParameter("firstNo"));
        secondNo = Integer.parseInt(request.getParameter("secondNo"));
        result = firstNo + secondNo;
        model.addAttribute("firstNo", firstNo);
        model.addAttribute("secondNo", secondNo);
        model.addAttribute("sum", result);
        result = firstNo - secondNo;
        model.addAttribute("sub", result);
        result = firstNo * secondNo;
        model.addAttribute("mult", result);
        return "calcresult";
    }
    @GetMapping(value="/demoshow")
    public String demoShow(Model model, HttpServletRequest request) {
        String sname = request.getParameter("sname");
        model.addAttribute("sname", sname);
        return "demoshow";
    }

    @GetMapping(value="/nameshow")
    public String nameShow(Model model, HttpServletRequest request) {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String fullName = firstName + " " + lastName;
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("fullName", fullName);
        return "nameshow";
    }

    @GetMapping(value="/nameinput")
    public String nameInput() {
        return "nameinput";
    }
    @RequestMapping(value="/demo")
    public String demo() {
        return "demo";
    }
    @RequestMapping(value="/dhivya")
    public String dhivya() {
        return "dhivya";
    }
    @RequestMapping(value="/naveen")
    public String naveen() {
        return "naveen";
    }
    @RequestMapping(value="/mega")
    public String mega() {
        return "mega";
    }
    @RequestMapping(value="/")
    public String home() {
        return "home";
    }
}
