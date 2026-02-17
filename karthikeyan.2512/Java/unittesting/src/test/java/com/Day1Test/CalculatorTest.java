package com.Day1Test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
        private Calculator c;
        static int count = 0;
    @BeforeEach
    public void setup() {
        c = new Calculator();
        System.out.println(++count + " : hiii ");
    }

    @ParameterizedTest
    @CsvSource({"1,2,3","5,9,14" , "98,2,100" , "2147483647, -2147483648, -1","1000000 , 1000000 , 2000000"})
    @DisplayName("testing the adding using positve numbers")
    void testingAddUsingPositive(int a, int b, int expected) {
        // Act
        int result = c.add(a, b);
        // Assert
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"-1 , -5 , -6" , "-10 , 10 , 0" , "-20 , -13 , -33" , "-2147483648 , -1 , 2147483647"})
    @DisplayName("testing the add using negative number")
    void testingAddUsingNegative(int a, int b, int expected) {
        // Act
        int result = c.add(a, b);
        // Assert
        assertEquals(expected, result);
    }


    // substraction method
    @ParameterizedTest
    @CsvSource({"-5 , -1 , -4" , "-100 , 23 , -123" , "234 , 234 , 0" ,"-875, -987, 112" , "87563 , 983759 , -896196"})
    @DisplayName("tesing the substraction using positive numbers")
    void  testingSubstractionUsingMixedNumber(int a, int b, int expected) {
        // Act
        int result = c.subtract(a, b);
        // Assert
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"5,1,4","12 , 6 , 6" , "12,15,-3","100 , 99 ,1","987 , 123 , 864","1000 , 1 ,999"})
    @DisplayName("testing the postive numbers in substraction")
    void testingPostiveNumbersInSubstraction(int a, int b, int expected) {
        // Act
        int result = c.subtract(a, b);
        // Assert
        assertEquals(expected, result);
    }


    // multiplication method
    @ParameterizedTest
    @CsvSource({"2,3,6","0,1,0","100,3,300","123,2,246","2147483647,1,2147483647"})
    @DisplayName("testing with negative numbers in multiplication")
    void testingWithPositiveNumbersInMultiplication(int a, int b, int expected) {
        // Act
        int result = c.multiply(a, b);
        // Assert
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource({"-1,0,0","-4,-2,8","-8765,87,-762555","-12 , 2, -24"})
    @DisplayName("testing negative numbers in multiplication")
    void testingWithNegativeNumbersInMultiplication(int a, int b, int expected) {
        // Act
        int result = c.multiply(a, b);
        // Assert
        assertEquals(expected, result);
    }


    // divide method


    @ParameterizedTest
    @CsvSource({"4,2,2","10,3,3","987,100,9","5687,10,568","983,2,491"})
    @DisplayName("dividing positive numbers")
    void testingDividingPositiveNumbers(int a, int b, int expected) {
        // Act
        int result = c.divide(a, b);
        // Assert
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"4,-2,-2","-10,-3,3","-987,100,-9","5687,-10,-568","-983,2,-491"})
    @DisplayName("dividing positive numbers")
    void testingDividingNegativeNumbers(int a, int b, int expected) {
        // Act
        int result = c.divide(a, b);
        // Assert
        assertEquals(expected, result);
    }
}
