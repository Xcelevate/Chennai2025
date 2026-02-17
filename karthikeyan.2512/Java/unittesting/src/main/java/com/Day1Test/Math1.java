package com.Day1Test;

public class Math1 {

    int add(int a, int b) {
        return a + b;
    }

    int divide(int a, int b) {
        return a / b;
    }

    int length(String s) {
        if (s == null || s.length() == 0)
            throw new NullPointerException();
        return s.length();
    }

    boolean isPalindrome(String s) {
        if (s == null || s.isEmpty())
            throw new NullPointerException();

        return new StringBuilder(s).reverse().toString().equals(s);
    }

    int factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative not allowed");
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    String greet(String name) {
        return "Hello, " + name;
    }

    int sum(int[] arr) {
        int total = 0;
        for (int n : arr) total += n;
        return total;
    }

    int max(int[] arr) {
        if (arr.length == 0) return 0;
        int max = arr[0];
        for (int n : arr) if (n > max) max = n;
        return max;
    }

    boolean isValidEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    String upcomingFeature() {
        return "Not implemented";
    }
}