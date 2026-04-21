package com.example.main;

import com.example.dao.EmployDao;
import com.example.model.Employ;
import com.example.util.ContextHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class EmployShowMain {
  public static void main(String[] args) {
    EmployDao employDao = ContextHelper.getSession();
    List<Employ> employList = employDao.showEmploy();
    employList.forEach(System.out::println);
  }
}
