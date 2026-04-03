package com.infinite.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntroTest {

  @BeforeAll
  static void setupAll() {
    System.out.println("Runs once before all tests");
  }

  @BeforeEach
  void setup() {
    System.out.println("Runs before each test");
  }

  @Test
  void testException() {
    assertThrows(ArithmeticException.class, () -> {
      int result = 10 / 0;
    });
  }

  @Test
  void test1() {}

  @ParameterizedTest
  @ValueSource(ints = {2, 4, 6, 8})
  void testEvenNumbers(int num) {
    assertEquals(0, num % 2);
  }

  @Test
  @Disabled("Not implemented yet")
  void skippedTest() {
  }

  @ParameterizedTest
  @CsvSource({
    "2, 3, 5",
    "10, 20, 30",
    "5, 5, 10"
  })
  void testAdd(int a, int b, int expected) {
    assertEquals(expected, a + b);
  }

  @Test
  void test2() {}
}
