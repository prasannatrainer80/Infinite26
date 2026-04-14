package com.infinite.hib;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import java.util.List;
import java.util.Scanner;

public class EmploySearchMain {
  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employ Number   ");
    empno = sc.nextInt();
    SessionFactory sf =new AnnotationConfiguration().configure().buildSessionFactory();
    Session session = sf.openSession();
    Query query = session.createQuery("from Employ where empno=:empno");
    query.setParameter("empno",empno);
    Employ employFound = (Employ)query.uniqueResult();
    if (employFound!=null){
      System.out.println(employFound);
    } else {
      System.out.println("*** Record Not Found ***");
    }
  }
}
