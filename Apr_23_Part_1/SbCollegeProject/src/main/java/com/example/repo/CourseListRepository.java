package com.example.repo;

import com.example.model.CourseList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseListRepository extends JpaRepository<CourseList, String> {
}
