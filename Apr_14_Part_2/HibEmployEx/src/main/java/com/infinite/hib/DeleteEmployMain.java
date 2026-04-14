package com.infinite.hib;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import java.util.Scanner;

public class DeleteEmployMain {
  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employ No  ");
    empno = sc.nextInt();
    SessionFactory sf =new AnnotationConfiguration().configure().buildSessionFactory();
    Session session = sf.openSession();
    Query query = session.createQuery("from Employ where empno=:empno");
    query.setParameter("empno",empno);
    Employ employFound = (Employ)query.uniqueResult();
    if (employFound !=null) {
      Transaction tx = session.beginTransaction();
      session.delete(employFound);
      tx.commit();
      System.out.println("*** Employ Record Deleted ***");
    } else {
      System.out.println("*** Employ Record Not Found ***");
    }
  }
}
