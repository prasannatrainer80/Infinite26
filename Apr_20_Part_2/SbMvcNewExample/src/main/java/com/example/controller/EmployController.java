package com.example.controller;

import com.example.dao.EmployDaoImpl;
import com.example.model.Employ;
import com.example.model.Login;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class EmployController {

    @Autowired
    private EmployDaoImpl employDao;

    @PostMapping("/saveemploy")
    public String save(@ModelAttribute Employ employ) {
        employDao.addEmploy(employ);
        return "redirect:/employshow";
    }


    @GetMapping("/addemploy")
    public String addEmploy(Model model) {
        model.addAttribute("employ", new Employ());
        return "addemploy";
    }


    @GetMapping(value = "/deleteemploy")
    public String deleteEmploy(HttpServletRequest request) {
        int empno = Integer.parseInt(request.getParameter("empno"));
        employDao.deleteEmploy(empno);
        return "redirect:/employshow";
    }

    @PostMapping("/updatefinal")
    public String updateFinal(@ModelAttribute Employ employ) {
        employDao.updateEmploy(employ);
        return "redirect:/employshow";
    }

    @PostMapping(value="/authenticate")
    public String authenticate(HttpServletRequest request) {
        Login login = new Login();
        login.setUserName(request.getParameter("userName"));
        login.setPassCode(request.getParameter("password"));
        int count = employDao.authentication(login);
        if (count==1) {
            return "redirect:/employshow";
        }
        return "redirect:/";
    }

    @GetMapping("/updateemploy")
    public String updateEmploy(@RequestParam("empno") int empno, Model model) {
        model.addAttribute("employ", employDao.searchEmploy(empno));
        return "updateemploy";
    }

    @GetMapping(value="/employshow")
    public String showEmploy(Model model) {
        List<Employ> employList = employDao.showEmploy();
        model.addAttribute("employList", employList);
        return "employshow";
//        return employDao.showEmploy();
    }




    @GetMapping(value="/")
    public String login() {
//        List<Employ> employList = employDao.showEmploy();
//        model.addAttribute("employList", employList);
        return "login";
//        return employDao.showEmploy();
    }
}
