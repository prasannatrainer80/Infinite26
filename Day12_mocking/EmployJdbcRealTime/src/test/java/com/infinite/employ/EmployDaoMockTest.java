package com.infinite.employ;

import com.infinite.employ.dao.EmployDao;
import com.infinite.employ.model.Employ;
import com.infinite.employ.model.Gender;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class EmployDaoMockTest {

  @Test
  public void testUpdateEmploy() throws SQLException, ClassNotFoundException {
    EmployDao empDao = Mockito.mock(EmployDao.class);
    Employ employ1 = new Employ(1,
      "Dhivya",
      Gender.FEMALE,
      "Java",
      "Manager",
      81112);

    when(empDao.updateEmploy(employ1)).thenReturn("Employ Record Updated...");

    String result = empDao.updateEmploy(employ1);

    assertEquals("Employ Record Updated...", result);
  }

  @Test
  public void testDeleteEmploy() throws SQLException, ClassNotFoundException {
    EmployDao empDao = Mockito.mock(EmployDao.class);
    when(empDao.deleteEmploy(-1)).thenReturn("Employ Record Not Found...");
    when(empDao.deleteEmploy(1)).thenReturn(("Employ Record Deleted..."));

    String result1 = empDao.deleteEmploy(-1);
    String result2 = empDao.deleteEmploy(1);

    assertEquals("Employ Record Not Found...", result1);
    assertEquals("Employ Record Deleted...", result2);
  }

  @Test
  public void testAddEmploy() throws SQLException, ClassNotFoundException {
    EmployDao empDao = mock(EmployDao.class);
    /* Assume Record Empno 1 alreaydy exists...Then
    Raise primary key exception
     */
    Employ employ1 = new Employ(1,
              "Dhivya",
              Gender.FEMALE,
          "Java",
              "Manager",
          81112);

    Employ employ2 = new Employ(3,
      "Deva", Gender.MALE,"React",
      "Developer",98234);

    when(empDao.addEmploy(employ1)).thenReturn("Duplicate Empno Found...");
    when(empDao.addEmploy(employ2)).thenReturn("Employ Record Inserted...");

    String result1 = empDao.addEmploy(employ1);
    String result2 = empDao.addEmploy(employ2);

    assertEquals("Duplicate Empno Found...", result1);
    assertEquals("Employ Record Inserted...",result2);

//    verify(empDao).addEmploy(any(Employ.class));
  }

  @Test
  public void testSearchEmploy() throws SQLException, ClassNotFoundException {
    EmployDao empDao = mock(EmployDao.class);
    Employ employ1 = new Employ(1,"Dhivya", Gender.FEMALE,"Java","Manager",81112);
    Employ employ2 = null;
    when(empDao.searchEmploy(1)).thenReturn(employ1);
    when(empDao.searchEmploy(100)).thenReturn(employ2);
    Employ mockEmployFound = empDao.searchEmploy(1);
    assertEquals(1, mockEmployFound.getEmpno());
    assertEquals("Dhivya", mockEmployFound.getName());
    assertEquals(Gender.FEMALE, mockEmployFound.getGender());
    assertEquals("Java",mockEmployFound.getDept());
    assertEquals("Manager",mockEmployFound.getDesig());
    assertEquals(81112, mockEmployFound.getBasic());
  }

   @Test
   public void testShowEmploy() throws SQLException, ClassNotFoundException {
      EmployDao empDao = mock(EmployDao.class);
      List<Employ> mockEmploys = Arrays.asList(
        new Employ(1,"Balu", Gender.MALE,"Java","Programmer",82344),
        new Employ(2,"Bawin", Gender.MALE,"Sql","Expert",99114),
        new Employ(3,"Deva", Gender.MALE,"React","Developer",98234),
        new Employ(4,"Dhivya", Gender.FEMALE,"Java","Manager",81112),
        new Employ(5,"Mega", Gender.FEMALE,"Sql","Tester",90522));

      /* Mapping Mocked Restult to Database Method Call */
      when(empDao.showEmploy()).thenReturn(mockEmploys);

     // Call method and check its returning Mocked Data or Not
      List<Employ> result = empDao.showEmploy();
      assertEquals(5, result.size());
   }
}
