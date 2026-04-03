package com.infinite.employ;

import com.infinite.employ.dao.EmployDao;
import com.infinite.employ.model.Employ;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class EmployDaoImplNewTest {

  @Test
  void testSearchEmploy() throws Exception {

    EmployDao dao = mock(EmployDao.class);
    Employ emp = new Employ();
    emp.setEmpno(1);
    emp.setName("Prasanna");

    when(dao.searchEmploy(1)).thenReturn(emp);

    Employ result = dao.searchEmploy(1);

    assertNotNull(result);
    assertEquals(1, result.getEmpno());
    assertEquals("Prasanna", result.getName());

    verify(dao).searchEmploy(1);
  }

  @Test
  void testAddEmploy() throws Exception {

    EmployDao dao = mock(EmployDao.class);

    when(dao.addEmploy(any(Employ.class)))
      .thenReturn("Employ Record Inserted...");

    Employ emp = new Employ();
    String result = dao.addEmploy(emp);

    assertEquals("Employ Record Inserted...", result);

    verify(dao).addEmploy(any(Employ.class));
  }
    @Test
    void testMockShowEmploy() throws Exception {
      // Mock DAO
      EmployDao dao = mock(EmployDao.class);
      // Create mock data
      List<Employ> mockList = new ArrayList<>();

      Employ e1 = new Employ();
      e1.setEmpno(1);
      e1.setName("Prasanna");

      Employ e2 = new Employ();
      e2.setEmpno(2);
      e2.setName("Kumar");

      mockList.add(e1);
      mockList.add(e2);

      // Mock method
      when(dao.showEmploy()).thenReturn(mockList);

      // Call method
      List<Employ> result = dao.showEmploy();

      // Assertions
      assertEquals(2, result.size());
      assertEquals("Prasanna", result.get(0).getName());
      assertEquals("Kumar", result.get(1).getName());
    }

  @Test
  void testUpdateEmploy() throws Exception {

    EmployDao dao = mock(EmployDao.class);

    when(dao.updateEmploy(any(Employ.class)))
      .thenReturn("Employ Record Updated...");

    Employ emp = new Employ();
    String result = dao.updateEmploy(emp);

    assertEquals("Employ Record Updated...", result);

    verify(dao).updateEmploy(any(Employ.class));
  }

  // ✅ 4. Test deleteEmploy()
  @Test
  void testDeleteEmploy() throws Exception {

    EmployDao dao = mock(EmployDao.class);

    when(dao.deleteEmploy(1))
      .thenReturn("Employ Record Deleted...");

    String result = dao.deleteEmploy(1);

    assertEquals("Employ Record Deleted...", result);

    verify(dao).deleteEmploy(1);
  }
  }

