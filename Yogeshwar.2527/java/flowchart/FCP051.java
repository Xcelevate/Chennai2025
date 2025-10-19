package javaPrograms;

import java.util.Scanner;

public class FCP051 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        while (n>9) {
            int a = 0;
            while (n != 0) {
                int d = n % 10;
                a+=d;
                n /= 10;

            }
            n=a;
        }
        System.out.println(n);
    }
}
