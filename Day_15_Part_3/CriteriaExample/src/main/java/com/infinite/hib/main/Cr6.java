package com.infinite.hib.main;

import com.infinite.hib.model.Employ;
import com.infinite.hib.util.SessionHelper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class Cr6 {
  public static void main(String[] args) {
    SessionFactory sf = SessionHelper.getSession();
    Session session = sf.openSession();
    Criteria criteria = session.createCriteria(Employ.class);
    criteria.add(Restrictions.like("name", "B%", MatchMode.START));
    List<Employ> employList = criteria.list();
    employList.forEach(System.out::println);

  }
}
