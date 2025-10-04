package javaPrograms;

import java.util.Scanner;

public class FCP045 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for(int k = 0 ; k < n-i ; k++) System.out.print("  ");
            for (int j = 0; j < (2*i)-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
