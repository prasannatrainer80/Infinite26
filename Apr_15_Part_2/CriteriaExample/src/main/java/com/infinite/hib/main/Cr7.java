package com.infinite.hib.main;

import com.infinite.hib.model.Employ;
import com.infinite.hib.util.SessionHelper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class Cr7 {
  public static void main(String[] args) {
    SessionFactory sf = SessionHelper.getSession();
    Session session = sf.openSession();
    Criteria cr = session.createCriteria(Employ.class);
    cr.add(Restrictions.in("dept",
      new String[] {"Java","React"}
    ));
    List<Employ> employList = cr.list();
    employList.forEach(System.out::println);

  }
}
