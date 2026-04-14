package com.infinite.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import java.util.Scanner;

public class AddEmployMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Employ employ = new Employ();
    System.out.println("Enter Employ Number  ");
    employ.setEmpno(sc.nextInt());
    System.out.println("Enter Name  ");
    employ.setName(sc.next());
    System.out.println("Enter Gender (MALE/FEMALE)  ");
    employ.setGender(Gender.valueOf(sc.next()));
    System.out.println("Enter Department  ");
    employ.setDept(sc.next());
    System.out.println("Enter Designation  ");
    employ.setDesig(sc.next());
    System.out.println("Enter Basic   ");
    employ.setBasic(sc.nextDouble());
    SessionFactory sf =new AnnotationConfiguration().configure().buildSessionFactory();
    Session session = sf.openSession();
    Transaction tx = session.beginTransaction();
    session.save(employ);
    tx.commit();
    session.close();
    System.out.println("Employ Record Inserted");
  }
}
