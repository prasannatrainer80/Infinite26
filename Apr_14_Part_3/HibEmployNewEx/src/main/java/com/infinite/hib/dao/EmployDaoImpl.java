package com.infinite.hib.dao;

import com.infinite.hib.model.Employ;
import com.infinite.hib.util.SessionHelper;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class EmployDaoImpl implements EmployDao {

  SessionFactory sessionFactory;
  Session session;
  @Override
  public List<Employ> showEmploy() {
    sessionFactory = SessionHelper.getSession();
    session = sessionFactory.openSession();
    Query query = session.createQuery("from Employ");
    return  query.list();
  }

  @Override
  public Employ searchEmploy(int empno) {
    sessionFactory = SessionHelper.getSession();
    session = sessionFactory.openSession();
    String cmd = "from Employ where empno=:empno";
    Query query = session.createQuery(cmd);
    query.setParameter("empno", empno);
    return (Employ) query.uniqueResult();
  }

  @Override
  public String addEmploy(Employ employ) {
    sessionFactory = SessionHelper.getSession();
    session = sessionFactory.openSession();
    Transaction tx = session.beginTransaction();
    session.save(employ);
    tx.commit();
    return "*** Employ Record Inserted ***";
  }

  @Override
  public String updateEmploy(Employ employ) {
    sessionFactory = SessionHelper.getSession();
    session = sessionFactory.openSession();
    Employ searchEmploy = searchEmploy(employ.getEmpno());
    session.close();
    if (searchEmploy != null) {
      session = sessionFactory.openSession();
      Transaction tx = session.beginTransaction();
      session.saveOrUpdate(employ);
      tx.commit();
      return " *** Employ Record Updated ***";
    }
    return "*** Employ Record Not Found ***";
  }

  @Override
  public String deleteEmploy(int empno) {
    sessionFactory = SessionHelper.getSession();
    session = sessionFactory.openSession();
    Employ searchEmploy = searchEmploy(empno);
    session.close();
    if (searchEmploy != null) {
      session = sessionFactory.openSession();
      Transaction tx = session.beginTransaction();
      session.delete(searchEmploy);
      tx.commit();
      return "*** Employ Record Deleted ***";
    }
    return "*** Employ Record Not Found ***";
  }
}
