package com.example.repo;

import com.example.model.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectsRepository extends JpaRepository<Subjects, Integer> {
    List<Subjects> findByInstructor(String instructor);
}
