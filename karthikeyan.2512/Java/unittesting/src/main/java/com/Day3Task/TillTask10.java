package com.Day3Task;

public class TillTask10 {

    public int compute(int n) {
        if (n < 0) throw new IllegalArgumentException("negative");
        int result = 1;
        for (int i = 2; i <= n; i++) result *= i;
        return result;
    }

    public String reverse(String s) {
        if (s == null) throw new NullPointerException();
        return new StringBuilder(s).reverse().toString();
    }

    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public double cToF(double c) {
        return c * 9.0 / 5.0 + 32.0;
    }

    public int divide(int a, int b) {
        if(b == 0) throw new ArithmeticException();
        return a / b;
    }

    public boolean isPalindrome(String s) {
        if (s == null) return false;
        String r = new StringBuilder(s).reverse().toString();
        return r.equalsIgnoreCase(s);
    }

    public boolean login(String user, String pass) {
        if (user == null || pass == null) return false;
        return user.equals("admin") && pass.equals("secret");
    }
    public int first(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("empty");
        return arr[0];
    }
}
