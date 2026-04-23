package com.example.controller;

import com.example.model.Feedback;
import com.example.service.FeedbackService;
import com.example.service.SubjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @Autowired
    private SubjectsService  subjectsService;

    @GetMapping(value="/addfeedback")
    public String addFeedback(Model model){
        List<String> instructors = subjectsService.showInstructors();
        model.addAttribute("instructors",instructors);
        return "addfeedback";
    }
}
