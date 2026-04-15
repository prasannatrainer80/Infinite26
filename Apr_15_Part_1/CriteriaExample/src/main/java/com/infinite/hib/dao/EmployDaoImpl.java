package com.infinite.hib.dao;

import com.infinite.hib.model.Employ;
import com.infinite.hib.util.SessionHelper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class EmployDaoImpl implements EmployDao {

  SessionFactory sessionFactory;
  Session session;

  @Override
  public List<Employ> showEmploy() {
   sessionFactory = SessionHelper.getSession();
   session = sessionFactory.openSession();
   Criteria criteria = session.createCriteria(Employ.class);
   return criteria.list();
  }

  public List<Employ> showByDeptAndBasic() {
    SessionFactory sf = SessionHelper.getSession();
    Session session = sf.openSession();
    Criteria cr = session.createCriteria(Employ.class);
    cr.add(Restrictions.eq("dept", "Java"));
    cr.add(Restrictions.ge("basic", 85000.00));
    List<Employ> employList = cr.list();
    return employList;
  }
  @Override
  public Employ showEmployById(int empno) {
    sessionFactory = SessionHelper.getSession();
    session = sessionFactory.openSession();
    Criteria criteria = session.createCriteria(Employ.class);
    criteria.add(Restrictions.eq("empno", empno));
    return (Employ) criteria.uniqueResult();
  }
}
