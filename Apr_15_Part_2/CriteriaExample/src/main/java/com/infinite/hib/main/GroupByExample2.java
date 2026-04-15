package com.infinite.hib.main;

import com.infinite.hib.model.Employ;
import com.infinite.hib.util.SessionHelper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import java.util.List;

public class GroupByExample2 {
  public static void main(String[] args) {
    SessionFactory sf = SessionHelper.getSession();
    Session session = sf.openSession();
    Criteria criteria = session.createCriteria(Employ.class);
    ProjectionList plist = Projections.projectionList();
    plist.add(Projections.groupProperty("gender"));
    plist.add(Projections.rowCount());
    criteria.setProjection(plist);
    List<Object[]> list = criteria.list();
    for(Object[] row : list) {
      System.out.println("Gender  " +row[0]);
      System.out.println("Total Employees " +row[1]);
    }

  }
}
