package javaPrograms;

import java.util.Scanner;

public class FCP080 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        long num1 = 0, num2 = 0;
        for (int i = 0; i < n; i++) {
            int d = s.nextInt();
            arr1[i] = d;
            num1 = num1 * 10 + d;
        }
        for (int i = 0; i < m; i++) {
            int d = s.nextInt();
            arr2[i] = d;
            num2 = num2 * 10 + d;
        }
        long mul = num1 * num2;
        int size;
        if(mul == 0){ size= 1;}
        else { size = 0;}
        long temp = mul;
        while (temp > 0) {
            temp /= 10;
            size++;
        }
        int[] res = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            res[i] = (int) (mul % 10);
            mul /= 10;
        }
        for (int d : res) {
            System.out.println(d);
        }
    }
}
