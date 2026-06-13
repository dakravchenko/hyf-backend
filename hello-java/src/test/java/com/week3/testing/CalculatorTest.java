package com.week3.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

  private Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }
  @Test
  void givenTwoNumbers_returnsTheirSum() {
    // Arrange

    // Act
    int result = calculator.add(2, 3);

    // Assert
    Assertions.assertEquals(5, result);
  }

  @Test
  void divide_twoIntegers_returnsIntegerResult() {
    int result = calculator.divide(4, 2);
    assertEquals(2, result);
  }

  // @Test
  // void divide_integerByInteger_returnsDoubleWhenOverloadedToDouble() {
  //   double result = calculator.divide(5, 2);
  //   assertEquals(2.5, result, 1e-9);
  // }

  @Test
  void divide_byZero_throwsArithmeticException() {
    Calculator calculator = new Calculator();
    assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
  }

  @Test
  void testSubtract() {

  }
}
