package com.infinite.hib.main;

import com.infinite.hib.model.Employ;
import com.infinite.hib.util.SessionHelper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;

import java.util.List;

public class Cr8 {
  public static void main(String[] args) {
    SessionFactory sf = SessionHelper.getSession();
    Session session = sf.openSession();
    Criteria cr = session.createCriteria(Employ.class);
    cr.addOrder(Order.desc("basic"));
    List<Employ> employList = cr.list();
    employList.forEach(System.out::println);
  }
}
