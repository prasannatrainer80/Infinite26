package com.infinite.hib.main;

import com.infinite.hib.model.Employ;
import com.infinite.hib.util.SessionHelper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import java.util.List;

public class ProjectionExample1 {
  public static void main(String[] args) {
    SessionFactory sf = SessionHelper.getSession();
    Session session = sf.openSession();
    Criteria cr = session.createCriteria(Employ.class);
    cr.setProjection(Projections.property("name"));
    List<String> names = cr.list();
    names.forEach(System.out::println);
  }
}
