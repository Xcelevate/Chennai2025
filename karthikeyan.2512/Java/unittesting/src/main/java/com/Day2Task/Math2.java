package com.Day2Task;

public class Math2 {


    public boolean isPalindrome(String s) {
        if (s == null || s.isEmpty())
            throw new NullPointerException();

        return new StringBuilder(s).reverse().toString().equals(s);
    }

    public boolean isEven(int n) {
        return n % 2 == 0;
    }

   public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

   public int length(String s) {
        return s.length();
    }


}
