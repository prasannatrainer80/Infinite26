package com.infinite.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class StoreDataMain {
  public static void main(String[] args) {
    Configuration cfg = new AnnotationConfiguration().configure();
    SessionFactory sf = cfg.buildSessionFactory();
    Session session =sf.openSession();
    Transaction transaction = session.beginTransaction();

    Employee employ1= new Employee();
    employ1.setName("Balu");
    employ1.setEmail("balu@infinite.com");

    Address address1 = new Address();
    address1.setAddress1("Changalpattu");
    address1.setAddress2("Ford Street");
    address1.setCity("Karaikudi");
    address1.setState("TN");
    address1.setZipcode("8472344");
    address1.setCountry("INDIA");

    address1.setEmployee(employ1);

    Employee employ2 = new Employee();
    employ2.setName("Megha");
    employ2.setEmail("mega@infinite.com");

    Address address2 = new Address();
    address2.setAddress1("Secor 5");
    address2.setAddress2("TRT-81");
    address2.setCity("Erode");
    address2.setState("TN");
    address2.setZipcode("482344");
    address2.setCountry("INDIA");

    address2.setEmployee(employ2);

    session.save(employ1);
    session.save(employ2);
    session.save(address1);
    session.save(address2);
    transaction.commit();
    session.close();
    System.out.println("Tables Created Successfully...");

  }
}
