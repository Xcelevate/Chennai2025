package javaPrograms;

import java.util.Scanner;

public class FCP041 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        long m1 = Long.MIN_VALUE;
        long m2 = Long.MIN_VALUE;
        long m3 = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            long d = s.nextLong();
            if (d > m1) {
                m3 = m2;
                m2 = m1;
                m1 = d;
            } else if (d > m2) {
                m3 = m2;
                m2 = d;
            } else if (d > m3) {
                m3 = d;
            }
        }


            System.out.println(m3);

    }
}
