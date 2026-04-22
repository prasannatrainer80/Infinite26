package com.example.controller;

import com.example.model.Subjects;
import com.example.service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SubjectsController {

    @Autowired
    private SubjectsService subjectsService;

    @GetMapping(value="/showsubjects")
    public String showSubjects(Model model) {
        List<Subjects> subjects = subjectsService.showSubjects();
        model.addAttribute("subjects", subjects);
        return "showsubjects";
    }

    @GetMapping(value="/showinstructorsubjects")
    public String showInstructorSubject(@RequestParam("instructor") String instructor, Model model) {
        List<Subjects> instructorSubjects = subjectsService.showInstructorSubject(instructor);
        model.addAttribute("instructorsubjects", instructorSubjects);
        return "instructorsubjects";
    }


    @PostMapping(value="/savesubjects")
    public String saveSubjects(@ModelAttribute Subjects subjects) {
        subjectsService.addSubject(subjects);
        return "redirect:/menu";
    }

    @GetMapping(value="/menu")
    public String showMenu() {
        return "menu";
    }

    @GetMapping(value="/addsubjects")
    public String addSubjects() {
        return "addsubjects";
    }
}
