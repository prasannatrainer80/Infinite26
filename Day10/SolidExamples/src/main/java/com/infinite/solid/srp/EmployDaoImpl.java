package com.infinite.solid.srp;

import java.util.ArrayList;
import java.util.List;

public class EmployDaoImpl implements EmployDao {

  static List<Employ> employList;

  static {
    employList = new ArrayList<Employ>();
  }

  @Override
  public List<Employ> showEmploy() {
    return employList;
  }

  @Override
  public String addEmploy(Employ employ) {
    employList.add(employ);
    return "Employ Record Inserted...";
  }
}
