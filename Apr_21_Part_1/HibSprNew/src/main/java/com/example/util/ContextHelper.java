package com.example.util;

import com.example.dao.EmployDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContextHelper {
  public static EmployDao getSession() {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
    EmployDao employDao = (EmployDao) ctx.getBean("employDao");
    return employDao;
  }
}
