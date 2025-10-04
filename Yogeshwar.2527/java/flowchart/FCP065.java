package javaPrograms;

import java.util.Scanner;

public class FCP065 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int a = n + m;
        int[] arrn = new int[n];
        int[] arrm = new int[m];
        int sum = 0;

        for (int i= 0; i < n; i++) arrn[i] = s.nextInt();
        for (int i= 0; i < m; i++) arrm[i] = s.nextInt();

        for (int i = 0; i < n;i++) sum += arrn[i];
        for (int i = 0; i < m;i++) sum +=arrm[i];

        double avg = (double) sum / a;
        System.out.printf("%.2f\n", avg);
    }
}
