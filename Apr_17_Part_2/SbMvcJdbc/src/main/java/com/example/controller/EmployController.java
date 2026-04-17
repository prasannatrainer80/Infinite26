package com.example.controller;

import com.example.dao.EmployDaoImpl;
import com.example.model.Employ;
import com.example.model.Gender;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployController {

    @Autowired
    private EmployDaoImpl employDao;

    @GetMapping(value = "/deleteemploy")
    public String deleteEmploy(HttpServletRequest request) {
        int empno = Integer.parseInt(request.getParameter("empno"));
        employDao.deleteEmploy(empno);
        return "redirect:/";
    }

    @GetMapping(value="/saveemploy")
    public String save(HttpServletRequest request, Model model){
        Employ employNew = new Employ();
        employNew.setEmpno(Integer.parseInt(request.getParameter("empno")));
        employNew.setName(request.getParameter("name"));
        employNew.setGender(Gender.valueOf(request.getParameter("gender")));
        employNew.setDept(request.getParameter("dept"));
        employNew.setDesig(request.getParameter("desig"));
        employNew.setBasic(Double.parseDouble(request.getParameter("basic")));
        employDao.addEmploy(employNew);
        return "redirect:/";
    }

    @GetMapping(value="/addemploy")
    public String addEmploy(){
        return "addEmploy";
    }

    @GetMapping(value="/updatefinal")
    public String updateFinal(Model model, HttpServletRequest request){
        Employ employUpdated = new Employ();
        employUpdated.setEmpno(Integer.parseInt(request.getParameter("empno")));
        employUpdated.setName(request.getParameter("name"));
        employUpdated.setGender(Gender.valueOf(request.getParameter("gender")));
        employUpdated.setDept(request.getParameter("dept"));
        employUpdated.setDesig(request.getParameter("desig"));
        employUpdated.setBasic(Double.parseDouble(request.getParameter("basic")));
        employDao.updateEmploy(employUpdated);
        return "redirect:/";
    }

    @GetMapping(value="/updateemploy")
    public String updateEmploy(Model model, HttpServletRequest request) {
        int empno = Integer.parseInt(request.getParameter("empno"));
        Employ employFound = employDao.searchEmploy(empno);
        model.addAttribute("employFound", employFound);
        return "updateemploy";
    }

    @GetMapping(value="/")
    public String showEmploy(Model model) {
        List<Employ> employList = employDao.showEmploy();
        model.addAttribute("employList", employList);
        return "employshow";
//        return employDao.showEmploy();
    }

}
