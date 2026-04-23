package com.example.service;

import com.example.model.CourseList;
import com.example.repo.CourseListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseListService {

    @Autowired
    private CourseListRepository courseListRepository;

    public List<CourseList> showCourses() {
        return  courseListRepository.findAll();
    }

    public CourseList searchByCourseId(String courseId) {
        return courseListRepository.findById(courseId).orElse(null);
    }

    public String addCourse(CourseList courseList) {
        courseListRepository.save(courseList);
        return "*** Course Added ***";
    }
}
