package com.infinite.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class DataNewTest {

  static Data data;

  @Test
  @Timeout(value=2,unit= TimeUnit.SECONDS)
  void timeOut() throws InterruptedException {
    Thread.sleep(1000);
  }

  @ParameterizedTest
  @MethodSource("com.infinite.junit.Data#showforcalc")
  void testAddition(int[] data) {
      int a = data[0];
      int b = data[1];
      assertEquals(data[2], a+b);
  }

  @ParameterizedTest
  @MethodSource("com.infinite.junit.Data#shownumbers")
  void testNumbers(int n) {
    assertTrue(n > 0);
  }
  @Test
  public void testArray() {
    int[] a = {1,2,3,4,5,6};
    assertEquals(4, data.show(a));
  }

  @Test
  public void testArrayException() {
    int[] a = {1,2,3};
    assertThrows(ArrayIndexOutOfBoundsException.class, () -> data.show(a));
  }

  @Test
  public void testDateNew() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//    sdf.parse("2026/04/03");
    ParseException ex = assertThrows(ParseException.class, () -> sdf.parse("2020/02/02"));
    assertTrue(ex.getMessage().contains("Unparseable date"));
  }

  @Test
  public void testDate() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//    sdf.parse("2026/04/03");
    ParseException ex = assertThrows(ParseException.class, () -> sdf.parse("2020/02/02"));
    assertEquals(ex.getMessage(),"Unparseable date: \"2020/02/02\"");
  }

  @RepeatedTest(3)
  void repeatMe() {
    assertTrue(2 < 5);
  }

  @Test
  @Disabled("Not implemented yet")
  void skippedTest() {
  }

  @Test
  void testException() {
    assertThrows(ArithmeticException.class, () -> {
      int result = data.division(10,0);
    });
  }

  @Test
  public void division() {
    assertEquals(5, data.division(10,2));
  }

  @Test
  public void testFact() {
    assertEquals(120, data.fact(5));
  }

  @Test
  public void testSayHello() {
    assertEquals("Welcome to Junit5 Programming...", data.sayHello());
  }
  @ParameterizedTest
  @CsvSource({
    "2, 3, 5",
    "5, 7, 12",
    "6, 8, 14",
    "5, 10, 15"
  })
  public void testAddition(int a, int b, int expected) {
    assertEquals(expected, a + b);
  }

  @Test
  public void testSum() {
    assertEquals(5, data.sum(2, 3));
  }

  @BeforeAll
  static void setupAll() {
    data = new Data();
    System.out.println("Runs once before all tests...Data Object Created");
  }

  @BeforeEach
  void setupEach() {
    System.out.println("Test Case Started");
  }

  @AfterEach
  void tearDownEach() {
    System.out.println("Test Case Ended");
  }

  @AfterAll
  static void tearDownAll() {
    System.out.println("Testing Completed and Resources Released");
    data = null;
  }
}
