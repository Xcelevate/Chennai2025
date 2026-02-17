package com.Day2Test;

import com.Day2Task.Math2;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.Collection;
import java.util.List;
import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

public class Math2Test {

    //palindrome check
    @ParameterizedTest
    @CsvSource({"karthik, false", "madam, true", "malayalam, true", "mam, true", "arumalai, false"})
    void checkingValidWord(String actual, boolean expected) {
        //Arrange
        Math2 math = new Math2();
        //Act  & Assert
        assertEquals(expected, math.isPalindrome(actual));
    }

    @ParameterizedTest
    @ValueSource(strings = {""})
    void checkingEmptyString(String actual) {
        //Arrange & Act &Assert
        assertThrows(NullPointerException.class, () -> new Math2().isPalindrome(actual));
    }

    /// ////  we can use @NullAndEmptySource  instead parameter method
    @Test
    void checkingNullPointer() {
        //Arrange & Act &Assert
        assertThrows(NullPointerException.class, () -> new Math2().isPalindrome(null));
    }


    // odd even test
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10, 12, 14, 16, 18, 64, 80, 100, 1000, 420, 980, 0})
    void checkingEvenNumbers(int num) {
        // Arrange
        Math2 math = new Math2();
        // Act & Assert
        assertTrue(math.isEven(num));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9, 13, 57, 87, 91, 457, 901, 1234567, 7633467, 912645, 87643})
    void checkingOddNumbers(int num) {
        // Arrange
        Math2 math = new Math2();
        // Act & Assert
        assertFalse((math.isEven(num)));
    }


    //// dynamic test
    @TestFactory
    Stream<DynamicTest> dynamicAddTests() {
        Math2 math = new Math2();
        return Stream.of(   DynamicTest.dynamicTest("1 + 2 = 3", () -> assertEquals(3, math.add(1, 2))),
                            DynamicTest.dynamicTest("5 + 9 = 14", () -> assertEquals(14, math.add(5, 9))),
                            DynamicTest.dynamicTest("98 + 2 = 100", () -> assertEquals(100, math.add(98, 2))),
                            DynamicTest.dynamicTest("MAX + MIN = -1", () -> assertEquals(-1, math.add(Integer.MAX_VALUE, Integer.MIN_VALUE))),
                            DynamicTest.dynamicTest("1000000 + 1000000 = 2000000", () -> assertEquals(2000000, math.add(1000000, 1000000))));
    }

    @ParameterizedTest
    @CsvSource({"2,3,6","0,1,0","100,3,300","123,2,246","2147483647,1,2147483647"})
    @DisplayName("testing with negative numbers in multiplication")
    void testingWithPositiveNumbersInMultiplication(int a, int b, int expected) {
        // Act
        int result = new Math2().multiply(a, b);
        // Assert
        assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/multipleTestCase.csv" , numLinesToSkip = 1)
    @DisplayName("testing negative numbers in multiplication")
    void testingWithNegativeNumbersInMultiplication(int a, int b, int expected) {
        // Act
        int result = new Math2().multiply(a, b);
        // Assert
        assertEquals(expected, result);
    }
    
    @ParameterizedTest
    @MethodSource("inputForString")
    void testingWithStrings(String input, int expected) {
        // Arrange
        Math2 math = new Math2();
        // Actv & Assert
        assertEquals(expected, math.length(input));
    }
    static Collection<Arguments> inputForString() {
        return List.of(
                Arguments.of("karthik",7),
                Arguments.of("java",4),
                Arguments.of("teacher",7),
                Arguments.of("hfghisjiuyhfguhgiuhgiohgiguhgiuhgidhgdighgidhugdiguhdgiu",56)
        );
    }


}
