package com.infinite.hib.main;

import com.infinite.hib.model.Employ;
import com.infinite.hib.util.SessionHelper;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.NamedQuery;
import java.util.List;

public class NamedQueryExample1 {
  public static void main(String[] args) {
    SessionFactory sessionFactory = SessionHelper.getSession();
    Session session = sessionFactory.openSession();
    Query query = session.getNamedQuery("showEmploy");
    List<Employ> employList = query.list();
    employList.forEach(System.out::println);
  }
}
