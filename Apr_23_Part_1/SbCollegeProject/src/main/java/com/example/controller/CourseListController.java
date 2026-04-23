package com.example.controller;

import com.example.model.CourseList;
import com.example.service.CourseListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CourseListController {

    @Autowired
    private CourseListService courseListService;

    @GetMapping(value="/showsearchcourselist")
    public String searchResult(@RequestParam("courseid") String courseid, Model model){
        CourseList courseListFound = courseListService.searchByCourseId(courseid);
        model.addAttribute("courseListFound", courseListFound);
        return "showsearchresult";
    }


    @GetMapping(value="/searchcourselist")
    public String searchCourseResult(){
        return "searchcourselist";
    }

    @PostMapping(value="/savecourselist")
    public String saveCourseList(@ModelAttribute CourseList courseList){
        courseListService.addCourse(courseList);
        return "redirect:/showcourselist";
    }

    @GetMapping(value="/addcourse")
    public String addCourse(Model model){
        model.addAttribute("courselist", new CourseList());
        return "addcourselist";
    }

    @GetMapping(value="/showcourselist")
    public String showCourseList(Model model){
        List<CourseList> courseList = courseListService.showCourses();
        model.addAttribute("courseList",courseList);
        return "showcourselist";
    }

    @GetMapping(value="/")
    public String showMenu() {
        return "menu";
    }

}
