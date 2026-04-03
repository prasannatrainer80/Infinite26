package com.infinite.junit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class TestCases {

  @ParameterizedTest
  @CsvSource({
    "2, 3, 5",
    "10, 20, 30",
    "6, 8, 14"
  })
  void testAddition(int a, int b, int expected) {
    assertEquals(expected, a + b);
  }

  @ParameterizedTest
  @MethodSource("com.infinite.junit.Data#shownumbers")
  void testNumbers(int n) {
    assertTrue(n > 0);
  }

  @TestFactory
  Collection<DynamicTest> dynamicTests() {
    return Arrays.asList(
      DynamicTest.dynamicTest("Test 1", () -> assertTrue(2 > 1)),
      DynamicTest.dynamicTest("Test 2", () -> assertEquals(4, 2 * 2))
    );
  }

  @Nested
  class WhenUserIsValid {

    @Test
    void shouldCreateUser() {
      assertTrue(true);
    }

    @Test
    void shouldReturnUserId() {
      assertEquals(1, 1);
    }
  }

  @Nested
  class WhenUserIsInvalid {

    @Test
    void shouldThrowException() {
      assertThrows(RuntimeException.class, () -> {
        throw new RuntimeException();
      });
    }
  }
  @RepeatedTest(3)
  void repeatMe() {
    assertTrue(2 < 5);
  }
  @Test
  @Timeout(value=2,unit = TimeUnit.SECONDS)
  void timeOut() throws InterruptedException {
    Thread.sleep(1000);
  }
}
