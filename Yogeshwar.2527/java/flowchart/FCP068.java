package javaPrograms;

import java.util.Scanner;

public class FCP068 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = s.nextInt();
        int x = s.nextInt();

        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == x) {
                    for (int k = i; k <= j; k++) {
                        System.out.println(arr[k]);
                    }
                    return;
                }
                if (sum > x) break;
            }
        }

           }
}
