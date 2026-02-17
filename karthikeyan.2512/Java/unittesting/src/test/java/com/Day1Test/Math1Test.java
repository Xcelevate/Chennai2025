package com.Day1Test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

public class Math1Test {

    //add Method
    @Test
    void checkingAddWithNumeric() {
        //Arrange
        Math1 math = new Math1();
        //Act  & Assert
        assertEquals(7, math.add(5, 2));
    }

    @Test
    void CheckingAddWithZero() {
        //Arrange
        Math1 math = new Math1();
        //Act  & Assert
        assertEquals(2, math.add(0, 2));
    }

    @Test
    void CheckingAddWithNegative() {
        //Arrange
        Math1 math = new Math1();
        //Act  & Assert
        assertEquals(1, math.add(-1, 2), "worked successfully");
    }

    @Test
    void checkingWithMax1Int() {
        //Arrange & Act &Assert
        assertThrows(ArithmeticException.class, () -> {
            java.lang.Math.addExact(Integer.MAX_VALUE, Integer.MAX_VALUE);
        });
    }

    @Test
    void checkingWithMinInt() {
        //Arrange
        Math1 math = new Math1();
        //Act  & Assert
        assertEquals(Integer.MIN_VALUE, math.add(-Integer.MAX_VALUE, -1), "worked successfully");
    }

    @Test
    void checkingWithMax2Int() {
        //Arrange
        Math1 math = new Math1();
        //Act  & Assert
        assertEquals(Integer.MAX_VALUE, math.add(-Integer.MIN_VALUE, -1), "worked successfully");
    }


    // divide Method
    @Test
    void checkingWithZero() {
        //Arrange
        Math1 math = new Math1();
        //Act  & Assert
        assertThrows(ArithmeticException.class, () -> math.divide(10, 0));
    }

    @Test
    void checkingWithNegative1() {
        //Arrange
        Math1 math = new Math1();
        //Act  & Assert
        assertEquals(10, math.divide(-10, -1), "worked successfully");
    }

    @Test
    void checkingWithNegative2() {
        //Arrange
        Math1 math = new Math1();
        //Act  & Assert
        assertEquals(-5, math.divide(-10, 2), "worked successfully");
    }

    @Test
    @DisplayName("rounded value")
    void checkingWithRoundValue() {
        //Arrange
        Math1 math = new Math1();
        //Act  & Assert
        assertEquals(3, math.divide(10, 3), "worked successfully");
    }

    @Test
    void checkingWithMaxNumber() {
        //Arrange
        Math1 math = new Math1();
        //Act  & Assert
        assertEquals(-Integer.MAX_VALUE, math.divide(Integer.MAX_VALUE, -1), "worked successfully");
    }


    // length of string
    @Test
    void lengthCheck() {
        //Arrange & Act &Assert
        assertEquals(7, "karthik".length());
    }

    @Test
    void nullOrEmptyCheck() {
        //Arrange
        Math1 math = new Math1();
        //Act  & Assert
        assertThrows(NullPointerException.class, () -> {
            assertTrue(math.length("") < 1);
        });
    }


    //palindrome check
    @ParameterizedTest
    @CsvSource({"karthik, false", "madam, true", "malayalam, true", "mam, true", "arumalai, false"})
    void checkingValidWord(String actual, boolean expected) {
        //Arrange
        Math1 math = new Math1();
        //Act  & Assert
        assertEquals(expected, math.isPalindrome(actual));
    }
    @ParameterizedTest
    @ValueSource(strings = {""})
    void checkingEmptyString(String actual) {
        //Arrange & Act &Assert
        assertThrows(NullPointerException.class, () -> new Math1().isPalindrome(actual));
    }
    /// ////  we can use @NullAndEmptySource  instead parameter method
    @ParameterizedTest
    @NullSource
    void checkingNullPointer(String s) {
        //Arrange & Act &Assert
        assertThrows(NullPointerException.class, () -> new Math1().isPalindrome(s));
    }



    // factorial checking test case
    @ParameterizedTest
    @CsvSource({"0, 1", "1,1", "2,2", "3,6", "10 , 3628800"})
    void checkingPositiveFactorial(int actual, int expected) {
        // Arrange & Act  & Assert
        assertEquals(expected, new Math1().factorial(actual));
    }
    @ParameterizedTest
    @ValueSource(ints = {-9, -6, -5, -65, -453})
    void checkingNegativeFactorial(int actual) {
        //Arrange & Act  & Assert
        assertThrows(IllegalArgumentException.class, () -> new Math1().factorial(actual));
    }



    // temperature checking test
    @ParameterizedTest
    @CsvSource({"11,51.8", "5,41", "100 ,212", "0,32", "22,71.6", "9 ,48.2", "-3,26.6", "-1,30.2", "-12,10.4", "-32,-25.6", "-31,-23.8", "-99, -146.2"})
    void checkingCelcius(double actual, double expected) {
        //Arrange
        Math1 math = new Math1();
        //Act  & Assert
        assertEquals(expected, math.celsiusToFahrenheit(actual), 0.4);
    }



    // Greet method checking
    @ParameterizedTest
    @ValueSource(strings = {"karthik", "hari", "amma", "sir", "narendra modi", "World"})
    void checkingGreeting(String actual) {
        //Arrange
        Math1 math = new Math1();
        //Act  & Assert
        assertEquals("Hello, " + actual, math.greet(actual));
    }
    @Test
    void checkingNullForGreeting() {
        //Arrange
        Math1 math = new Math1();
        //Act  & Assert
        assertEquals("Hello, " + null, math.greet(null));
    }



    //sum of array checking
    @Test
    void checkingArrayWithValue1() {
        //Arrange
        Math1 math = new Math1();
       int expected = 10;
        //Act  & Assert
        assertEquals(expected , math.sum(new int[]{1,2,3,4}));
    }
    @Test
    void checkingEmptySumArray(){
        //Arrange
        Math1 math = new Math1();
        int expected = 0;
        //Act  & Assert
        assertEquals(expected , math.sum(new int[]{}));
    }
    @Test
    void checkingArrayWithValue2(){
        //Arrange
        Math1 math = new Math1();
        int expected = -13;
        //Act  & Assert
        assertEquals(expected , math.sum(new int[]{4,3,2,1,-5,-8,-10}));
    }


    //max finder test cases
    @Test
    void checkingMaxInArray1(){
        //Arrange
        Math1 math = new Math1();
        int expected = Integer.MAX_VALUE;
        //Act  & Assert
        assertEquals(expected , math.max(new int[]{1,2,3,4,Integer.MAX_VALUE}));
    }
    @Test
    void checkingMaxInArray2(){
        //Arrange
        Math1 math = new Math1();
        int expected = 976;
        //Act  & Assert
        assertEquals(expected , math.max(new int[]{65,24,8,7,24,9,789,438,78,976,54,285,14,796,35}));
    }
    @Test
    void checkingMaxInArray3(){
        //Arrange
        Math1 math = new Math1();
        int expected = 20;
        //Act  & Assert
        assertEquals(expected , math.max(new int[]{20,19,16,15,14,12,9,7,3,1,0}));
    }
    @Test
    void checkingEmptyMaxArray(){
        //Arrange
        Math1 math = new Math1();
        int expected = 0;
        //Act  & Assert
        assertEquals(expected , math.max(new int[]{}));
    }



    //email validation method test
    @ParameterizedTest
    @CsvSource({"karthikeyan2205@gmail.com , true" ,
                "pbce@clg.org , true" ,
                "jkhgjghkb.com , false" ,
                " iuhgtiguhgh@gamil , false" ,
                "hjfghiueroiuytghiuyth@@gmail..com , true" ,
                "fguhyg@@gmail.%$&(com , true" })
    void checkingEmail(String email , boolean expected) {
        // Arrange
        Math1 math = new Math1();
        //Act  & Assert
        assertEquals(expected, math.isValidEmail(email.trim()));
    }



    // upcoming feature

    @Test
    @Disabled
    void checkingUpcomingFeature() {
        // Arrange
        Math1 math = new Math1();
        //  Act & Assert
        math.upcomingFeature();
    }


}
