package com.infinite.hib.dao;

import com.infinite.hib.model.Employ;

import java.util.List;

public interface EmployDao {
  List<Employ> showEmploy();
  Employ showEmployById(int empno);
}
