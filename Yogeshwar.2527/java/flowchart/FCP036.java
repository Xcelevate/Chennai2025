package javaPrograms;

import java.util.Scanner;

public class FCP036 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if (b > a) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        long hcf = 1, lcm;

        for (long i = b; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
                break;
            }
        }

        lcm = (a / hcf) * b;

        System.out.println(hcf);
        System.out.println(lcm);
    }
}
