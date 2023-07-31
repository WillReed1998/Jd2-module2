package org.example.tests;

import org.example.Calculator;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestCalculator {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before test suit: " + System.currentTimeMillis());
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After test suit: " + System.currentTimeMillis());
    }

    @Test
    public void testSum() {

    //Given
    Calculator calculator = new Calculator();

    //When
    final int val1 = 2;
    final int val2 = 2;
    final int result = Calculator.sum(val1, val2);

    //Then
    int expected = val1 + val2;
    assertEquals(expected, result);
    }

    @Test
    public void testSubtract() {

        //Given
        Calculator calculator = new Calculator();

        //When
        final int val1 = 2;
        final int val2 = 2;
        final int result = Calculator.subtract(val1, val2);

        //Then
        int expected = val1 - val2;
        assertEquals(expected, result);
    }

    @Test
    public void testMultiply() {

        //Given
        Calculator calculator = new Calculator();

        //When
        final int val1 = 2;
        final int val2 = 2;
        final int result = Calculator.multiply(val1, val2);

        //Then
        int expected = val1 * val2;
        assertEquals(expected, result);
    }

    @Test
    public void testDivide() {

        //Given
        Calculator calculator = new Calculator();

        //When
        final int val1 = 2;
        final int val2 = 2;
        final int result = Calculator.divide(val1, val2);

        //Then
        int expected = val1 / val2;
        assertEquals(expected, result);
    }

    @Test
    public void testDivideByZero() {
        //Given
        Calculator calculator = new Calculator();

        //When & Then
        final int val1 = 2;
        final int val2 = 0;
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(val1, val2));
    }
}
