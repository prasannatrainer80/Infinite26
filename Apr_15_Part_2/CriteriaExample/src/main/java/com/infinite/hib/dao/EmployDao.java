package com.infinite.hib.dao;

import com.infinite.hib.model.Employ;
import com.infinite.hib.model.Login;

import java.util.List;

public interface EmployDao {
  List<Employ> showEmploy();
  Employ showEmployById(int empno);
  int authenticate(Login login);
}
