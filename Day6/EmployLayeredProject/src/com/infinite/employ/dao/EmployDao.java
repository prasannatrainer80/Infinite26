package com.infinite.employ.dao;

import com.infinite.employ.model.Employ;

import java.util.List;

public interface EmployDao {
    String addEmployDao(Employ employ);
    List<Employ> showEmployDao();
}
