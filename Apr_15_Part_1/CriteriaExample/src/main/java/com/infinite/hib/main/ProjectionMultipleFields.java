package com.infinite.hib.main;

import com.infinite.hib.model.Employ;
import com.infinite.hib.util.SessionHelper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;

import java.util.List;

public class ProjectionMultipleFields {
  public static void main(String[] args) {
    SessionFactory sf = SessionHelper.getSession();
    Session session = sf.openSession();
    Criteria cr = session.createCriteria(Employ.class);


    cr.setProjection(Projections.projectionList()
      .add(Projections.property("empno"))
      .add(Projections.property("name"))
      .add(Projections.property("basic")));

    List<Object[]> list = cr.list();

    for(Object[] obj : list) {
      System.out.println("Employ No  " + obj[0]);
      System.out.println("Employ Name  " + obj[1]);
      System.out.println("Salary   " + obj[2]);
      System.out.println("=================================");
    }
  }
}
