package com.infinite.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployTest {

  @Test
  public void testConstructors() {
    Employ employ = new Employ(1, "Kaviya","FEMALE",
      "Java","Programmer",99211.12);
    assertEquals(1, employ.getEmpno());
    assertEquals("Kaviya", employ.getName());
    assertEquals("FEMALE", employ.getGender());
    assertEquals("Java", employ.getDept());
    assertEquals("Programmer", employ.getDesig());
    assertEquals(99211.12, employ.getBasic());
  }

  @Test
  public void testGettersAndSetters() {
    Employ employ = new Employ();
    employ.setEmpno(1);
    employ.setName("Deva");
    employ.setGender("MALE");
    employ.setDept("Java");
    employ.setDesig("Programmer");
    employ.setBasic(99882.11);

    assertEquals(1, employ.getEmpno());
    assertEquals("Deva", employ.getName());
    assertEquals("MALE", employ.getGender());
    assertEquals("Java",employ.getDept());
    assertEquals("Programmer", employ.getDesig());
    assertEquals(99882.11, employ.getBasic());
  }
}
