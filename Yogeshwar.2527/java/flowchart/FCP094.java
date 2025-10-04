package javaPrograms;

import java.util.Scanner;

public class FCP094 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  n = s.nextInt();
        int st = 2, en = n*2 - 2;
        for (int i = 0; i < n; i++) System.out.print("* ");
        System.out.println();
        for (int i = n-2; i >= 0; i--) {
            for (int j = 1; j < n*2; j++) {
                if (j == st || j == en) System.out.print("*");
                else System.out.print(" ");
            }
            st++;
            en--;
            System.out.println();
        }
        st -= 2;
        en += 2;
        for (int i = 1; i < n-1; i++) {
            for (int j = 1; j < n*2; j++) {
                if (j == st || j == en) System.out.print("*");
                else System.out.print(" ");
            }
            st--;
            en++;
            System.out.println();
        }
        for (int i = 0; i < n; i++) System.out.print("* ");
    }
}
