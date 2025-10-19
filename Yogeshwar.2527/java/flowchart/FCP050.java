package javaPrograms;

import java.util.Scanner;

public class FCP050 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n <= 1) {
            System.out.println();
            return;
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && n % i == 0) {
                System.out.println(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }
    }
}
