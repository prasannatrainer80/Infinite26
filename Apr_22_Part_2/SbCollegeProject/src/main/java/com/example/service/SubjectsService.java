package com.example.service;

import com.example.model.Subjects;
import com.example.repo.SubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectsService {

    @Autowired
    private SubjectsRepository subjectsRepository;

    public List<Subjects> showSubjects() {
        return subjectsRepository.findAll();
    }

    public String addSubject(Subjects subjects) {
        subjectsRepository.save(subjects);
        return "Subject Added...";
    }

    public Subjects findSubjectById(int id) {
        return subjectsRepository.findById(id).get();
    }

   public List<Subjects> showInstructorSubject(String instructor) {
        return subjectsRepository.findByInstructor(instructor);
   }
}
