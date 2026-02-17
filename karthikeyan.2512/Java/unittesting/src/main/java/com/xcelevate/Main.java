package com.xcelevate;

import java.util.*;

public class Main {
    public static int minDeletions(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int oddCount = 0;
        for (int f : freq) {
            if (f % 2 != 0) oddCount++;
        }

        return oddCount > 0 ? oddCount - 1 : 0;
    }

    public static void main(String[] args) {
        String s = "abcedda";
        System.out.println(minDeletions(s)); // Output: 2
    }
}
