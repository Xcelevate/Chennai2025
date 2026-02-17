package com.Day3Test;

import com.Day3Task.TillTask10;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class TillTask10Test {
    TillTask10 test;

    @BeforeEach
    void setUp() {
        test = new TillTask10();
    }

    @Nested
    class ComputeTest {

        @Test
        void shouldThrowExceptionWhenLessThanZero() {
            assertThrows(IllegalArgumentException.class, () -> {
                test.compute(-5);
            });
            assertThrows(IllegalArgumentException.class, () -> {
                test.compute(-10);
            });
        }

        @ParameterizedTest
        @CsvFileSource(resources = "/test-data_compute.csv", numLinesToSkip = 1)
        void shouldFactWhenPostiveNumbers(int input, int expected) {
            // assert
            assertEquals(expected, test.compute(input));
        }
    }

    @Nested
    class ReverseTest {
        static Stream<Arguments> reverseValues() {
            return Stream.of(Arguments.of("amma", "amma"),
                    Arguments.of("malayalam", "malayalam"),
                    Arguments.of("level", "level"),
                    Arguments.of("racecar", "racecar"),
                    Arguments.of("karthik", "kihtrak"),
                    Arguments.of("welcome", "emoclew"),
                    Arguments.of("rotor", "rotor"),
                    Arguments.of("hello world", "dlrow olleh"));
        }

        @ParameterizedTest
        @MethodSource("reverseValues")
        void chekingReverseValue(String input, String expected) {
            // Assert
            assertEquals(expected, test.reverse(input));
        }
    }

    @Nested
    class PrimeTest {

        @TestFactory
        Stream<DynamicTest> dynamicTests() {
            List<Integer> prime = Arrays.asList(2, 3, 5, 7, 11, 13, 19, 23);
            List<Integer> nonPrime = Arrays.asList(-1, 0, 1, 4, 6, 9, 12, 15, 99);

            Stream<DynamicTest> primeTest = prime.stream()
                    .map(n -> DynamicTest.dynamicTest("yetyey", () -> assertTrue(test.isPrime(n))));

            Stream<DynamicTest> nonPrimeTest = nonPrime.stream()
                    .map(n -> DynamicTest.dynamicTest("yeydye", () -> assertFalse(test.isPrime(n))));

            return Stream.concat(primeTest, nonPrimeTest);
        }
    }

    @Nested
    class celsiusToFahrenheitTest {

        @ParameterizedTest
        @CsvSource({"0, 32", "100, 212", "-40, -40", "25, 77", "50, 122",
                "-10, 14", "-20, -4", "10, 50", "20, 68", "30, 86", "60, 140",
                "80, 176"
        })
        void testingFarenheit(int actual, int expected) {
            assertEquals(expected, test.cToF(actual), 0.1);
        }
    }

    @Nested
    class DivideTest{

        @TestFactory
        Collection<DynamicTest> result(){
            return List.of(
                DynamicTest.dynamicTest("divide by zero", () -> {assertThrows(ArithmeticException.class, () -> test.divide(34, 0));}),
                DynamicTest.dynamicTest("divide by number" , () -> {assertEquals(34, test.divide(34, 1));})
                );
        }
    }

    @Nested
    class PalindromeTest{

        @ParameterizedTest
        @ValueSource(strings = {"Madam" ,"Siris" , "level" ,"malayalaM" ,"Racecar" ,"Mom"})
        void testingValidStrings(String input){
            assertTrue(test.isPalindrome(input));
        }

        @ParameterizedTest
        @ValueSource(strings = {"ggwrtwt","jahtir","karthik","harikrishnan","durgadevi"})
        void testingInvalidStrings(String input){
            assertFalse(test.isPalindrome(input));
        }

        @ParameterizedTest
        @NullSource
        void testingNullStrings(String input){
            assertFalse(test.isPalindrome(input));
        }
    }

    @Nested
    class LoginTest{

       static Stream<Arguments> inputForLoginTest(){
            return Stream.of(
                    Arguments.of("admin" ,"secret", true),
                    Arguments.of("karthik","leo",false),
                    Arguments.of("admin" ,null , false),
                    Arguments.of(null,"secret" , false),
                    Arguments.of(null,null,false),
                    Arguments.of("","",false)
            );
        }

        @ParameterizedTest
        @MethodSource("inputForLoginTest")
        void testingLogin(String user ,String pass, boolean expected){
            assertSame(expected ,test.login(user,pass));
        }
    }

    @Nested
    class ArrayTest{
        @TestFactory
        Collection<DynamicTest> inputForArray(){
            return List.of(
                    DynamicTest.dynamicTest("1'st test",() -> {assertEquals(3, test.first(new int[]{3,4,5,6,7}));}),
                    DynamicTest.dynamicTest("single element test",() -> {assertEquals(1 , test.first(new int[]{1}));}),
                    DynamicTest.dynamicTest("null test",() -> assertThrows(IllegalArgumentException.class , () -> test.first(null)))
            );
        }

    }

}

