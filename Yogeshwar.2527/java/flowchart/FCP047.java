package javaPrograms;

import java.util.Scanner;

public class FCP047 {
    public static int FindHcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int hcf = s.nextInt();
        for (int i = 1; i < n; i++) {
            int next = s.nextInt();
            hcf = FindHcf(hcf, next);
        }
        System.out.println(hcf);
    }
}
