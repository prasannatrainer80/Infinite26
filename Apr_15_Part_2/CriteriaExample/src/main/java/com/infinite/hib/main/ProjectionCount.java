package com.infinite.hib.main;

import com.infinite.hib.model.Employ;
import com.infinite.hib.util.SessionHelper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;

public class ProjectionCount {
  public static void main(String[] args) {
    SessionFactory sf = SessionHelper.getSession();
    Session session = sf.openSession();
    Criteria cr = session.createCriteria(Employ.class);
    cr.setProjection(Projections.rowCount());
    long count =(Long)cr.uniqueResult();
    System.out.println("Total Records Are   " +count);

  }
}
