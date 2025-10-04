package javaPrograms;

import java.util.Scanner;

public class FCP064 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();
        long[] arr1 = new long[n];
        long[] arr2 = new long[m];
        long[] mer = new long[n + m];


        for (int i = 0; i < n; i++) {
            arr1[i] = s.nextLong();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = s.nextLong();
        }
        int a1 = 0, a2 = 0, m1 = 0;
        while (a1 < n && a2 < m) {
            if (arr1[a1] < arr2[a2]) {
                mer[m1++] = arr1[a1++];
            } else {
                mer[m1++] = arr2[a2++];
            }
        }
        while (a1 < n) {
            mer[m1++] = arr1[a1++];
        }
        while (a2 < m) {
            mer[m1++] = arr2[a2++];
        }
        for (int i = 0; i < n + m; i++) {
            System.out.println(mer[i]);
        }
    }
}
