package com.infinite.employ;

import com.infinite.employ.dao.EmployDao;
import com.infinite.employ.dao.EmployDaoImpl;
import com.infinite.employ.model.Employ;
import com.infinite.employ.model.Gender;
import com.infinite.employ.util.ConnectionHelper;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class EmployDaoImplTest {

  @Test
  void testServiceWithMockedList() throws Exception {

    EmployDao dao = mock(EmployDao.class);

    List<Employ> mockList = new ArrayList<>();

    Employ e1 = new Employ();
    e1.setEmpno(1);
    e1.setName("Prasanna");

    mockList.add(e1);

    when(dao.showEmploy()).thenReturn(mockList);

//    EmployService service = new EmployService(dao);

//    List<Employ> result = service.getAllEmployees();

    assertEquals(1, dao.showEmploy().size());
//    assertEquals("Prasanna", result.get(0).getName());
  }

  @Test
  void testDeleteEmploy() throws Exception {

    Connection conn = mock(Connection.class);

    PreparedStatement pstSelect = mock(PreparedStatement.class);
    PreparedStatement pstDelete = mock(PreparedStatement.class);

    ResultSet rs = mock(ResultSet.class);

    try (MockedStatic<ConnectionHelper> mocked = mockStatic(ConnectionHelper.class)) {

      mocked.when(ConnectionHelper::getConnection).thenReturn(conn);

      // Separate mocks
      when(conn.prepareStatement(startsWith("select"))).thenReturn(pstSelect);
      when(conn.prepareStatement(startsWith("Delete"))).thenReturn(pstDelete);

      // Mock SELECT
      when(pstSelect.executeQuery()).thenReturn(rs);
      when(rs.next()).thenReturn(true);

      when(rs.getInt("empno")).thenReturn(1);
      when(rs.getString("name")).thenReturn("Prasanna");
      when(rs.getString("gender")).thenReturn("MALE");
      when(rs.getString("dept")).thenReturn("IT");
      when(rs.getString("desig")).thenReturn("Dev");
      when(rs.getDouble("basic")).thenReturn(50000.0);

      // Mock DELETE
      when(pstDelete.executeUpdate()).thenReturn(1);

      EmployDaoImpl dao = new EmployDaoImpl();
      String result = dao.deleteEmploy(1);

      assertEquals("Employ Record Deleted...", result);

      verify(pstDelete).setInt(1, 1);
      verify(pstDelete).executeUpdate();
    }
  }

  @Test
  void testAddEmploy() throws Exception {

    Connection conn = mock(Connection.class);
    PreparedStatement pst = mock(PreparedStatement.class);

    try (MockedStatic<ConnectionHelper> mocked = mockStatic(ConnectionHelper.class)) {

      mocked.when(ConnectionHelper::getConnection).thenReturn(conn);

      when(conn.prepareStatement(anyString())).thenReturn(pst);
      when(pst.executeUpdate()).thenReturn(1);

      Employ emp = new Employ();
      emp.setEmpno(1);
      emp.setName("Prasanna");
      emp.setGender(Gender.MALE);
      emp.setDept("IT");
      emp.setDesig("Dev");
      emp.setBasic(50000);

      EmployDaoImpl dao = new EmployDaoImpl();
      String result = dao.addEmploy(emp);

      assertEquals("Employ Record Inserted...", result);

      verify(pst).setInt(1, 1);
      verify(pst).setString(2, "Prasanna");
    }
  }

  @Test
  void testSearchEmploy() throws Exception {

    // Mock objects
    Connection conn = mock(Connection.class);
    PreparedStatement pst = mock(PreparedStatement.class);
    ResultSet rs = mock(ResultSet.class);

    // Static mocking
    try (MockedStatic<ConnectionHelper> mocked = mockStatic(ConnectionHelper.class)) {

      mocked.when(ConnectionHelper::getConnection).thenReturn(conn);

      when(conn.prepareStatement(anyString())).thenReturn(pst);
      when(pst.executeQuery()).thenReturn(rs);

      when(rs.next()).thenReturn(true);
      when(rs.getInt("empno")).thenReturn(1);
      when(rs.getString("name")).thenReturn("Prasanna");
      when(rs.getString("gender")).thenReturn("MALE");
      when(rs.getString("dept")).thenReturn("IT");
      when(rs.getString("desig")).thenReturn("Developer");
      when(rs.getDouble("basic")).thenReturn(50000.0);

      EmployDaoImpl dao = new EmployDaoImpl();
      Employ emp = dao.searchEmploy(1);

      assertNotNull(emp);
      assertEquals(1, emp.getEmpno());
      assertEquals("Prasanna", emp.getName());
    }
  }
}
