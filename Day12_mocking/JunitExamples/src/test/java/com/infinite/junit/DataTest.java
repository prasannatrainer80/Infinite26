package com.infinite.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DataTest {

  @Test
  public void testData() {
    Data data = null;
    assertNull(data);
    data = new Data();
    assertNotNull(data);
  }

  @Test
  public void testPosNeg() {
    Data data = new Data();
    assertTrue(data.posNeg(5));
    assertFalse(data.posNeg(-5));
  }

  @Test
  public void testMax3() {
    Data data = new Data();
    assertEquals(5, data.max3(5,2,3));
    assertEquals(5, data.max3(2,5,3));
    assertEquals(5, data.max3(3,2,5));
  }
  @Test
  public void testSayHello() {
    Data data = new Data();
    assertEquals("Welcome to Junit5 Programming...", data.sayHello());
  }

  @Test
  public void testSum() {
    Data data = new Data();
    assertEquals(5, data.sum(2,3));
  }

  @Test
  public void testFact() {
    Data data = new Data();
    assertEquals(120, data.fact(5));
  }
}
