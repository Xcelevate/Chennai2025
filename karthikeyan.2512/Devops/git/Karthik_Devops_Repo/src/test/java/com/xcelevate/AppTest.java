package com.xcelevate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    App calc = new App();

    @Test
    void testAdd() {
        assertEquals(10, calc.add(6, 4));
    }

    @Test
    void testSubtract() {
        assertEquals(2, calc.subtract(6, 4));
    }

    @Test
    void testMultiply() {
        assertEquals(24, calc.multiply(6, 4));
    }

    @Test
    void testDivide() {
        assertEquals(1.5, calc.divide(3, 2));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calc.divide(5, 0));
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
