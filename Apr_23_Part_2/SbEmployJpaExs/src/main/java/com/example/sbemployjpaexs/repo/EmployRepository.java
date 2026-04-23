package com.example.sbemployjpaexs.repo;

import com.example.sbemployjpaexs.model.Employ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployRepository extends JpaRepository<Employ, Integer> {
}
