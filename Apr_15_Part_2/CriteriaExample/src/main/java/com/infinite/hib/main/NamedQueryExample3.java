package com.infinite.hib.main;

import com.infinite.hib.model.Login;
import com.infinite.hib.util.SessionHelper;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Scanner;

public class NamedQueryExample3 {
  public static void main(String[] args) {
    String user, pwd;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter UserName and Password   ");
    user = sc.next();
    pwd = sc.next();
    SessionFactory sessionFactory = SessionHelper.getSession();
    Session session = sessionFactory.openSession();
    Query query = session.getNamedQuery("login");
    query.setParameter("userName", user);
    query.setParameter("passCode", pwd);
    Login login = (Login)query.uniqueResult();
    if (login != null) {
      System.out.println("*** Correct Credentials ***");
    } else {
      System.out.println("*** Invalid Credentials ***");
    }
  }
}
