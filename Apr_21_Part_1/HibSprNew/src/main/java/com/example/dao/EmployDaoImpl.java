package com.example.dao;


import com.example.model.Employ;
import org.springframework.orm.hibernate5.HibernateTemplate;
import javax.transaction.Transactional;
import java.util.List;

public class EmployDaoImpl implements EmployDao {

  private HibernateTemplate hibernateTemplate;

  public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
    this.hibernateTemplate = hibernateTemplate;
  }


  @Override
  public List<Employ> showEmploy() {
    return hibernateTemplate.loadAll(Employ.class);
  }

  @Override
  public Employ showEmploy(int empno) {
    return hibernateTemplate.get(Employ.class, empno);
  }

  @Transactional
  @Override
  public int addEmploy(Employ employ) {
    return (int) hibernateTemplate.save(employ);
  }

  @Transactional
  @Override
  public void updateEmploy(Employ employ) {
    hibernateTemplate.update(employ);
  }

  @Transactional
  @Override
  public void deleteEmploy(Employ employ) {
    hibernateTemplate.delete(employ);
  }
}
