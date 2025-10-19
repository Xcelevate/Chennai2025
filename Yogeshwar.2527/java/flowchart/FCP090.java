package javaPrograms;

import java.util.Scanner;

public class FCP090 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j <= n; j++) {
                System.out.print(j + " ");
            }
            for (int k = n + 1; k > 1 + i; k--) {
                System.out.print(k + " ");
            }
                System.out.println();
            }
        }
    }
