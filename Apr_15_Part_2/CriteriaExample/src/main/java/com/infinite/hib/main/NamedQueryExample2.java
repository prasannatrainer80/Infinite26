package com.infinite.hib.main;

import com.infinite.hib.model.Employ;
import com.infinite.hib.util.SessionHelper;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Scanner;

public class NamedQueryExample2 {
  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employ Number   ");
    empno = sc.nextInt();
    SessionFactory sessionFactory = SessionHelper.getSession();
    Session session = sessionFactory.openSession();
    Query query = session.getNamedQuery("searchEmploy");
    query.setParameter("empno", empno);
    Employ employFound = (Employ) query.uniqueResult();
    if (employFound != null) {
      System.out.println(employFound);
    } else {
      System.out.println("*** Employ Record Not Found ***");
    }
  }
}
