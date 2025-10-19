package javaPrograms;

import java.util.Scanner;

public class FCP066 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        int[] intersection = new int[Math.min(a, b)];
        int[] union = new int[a + b];
        for (int i = 0; i < a; i++) {
            arr1[i] = s.nextInt();
        }
        for (int j = 0; j < b; j++) {
            arr2[j] = s.nextInt();
        }
        int i = 0, j = 0, u = 0, in = 0;
        while (i < a && j < b) {
            if (arr1[i] < arr2[j]) {
                if (u == 0 || union[u - 1] != arr1[i]) {
                    union[u++] = arr1[i];
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (u == 0 || union[u - 1] != arr2[j]) {
                    union[u++] = arr2[j];
                }
                j++;
            } else {
                int common = arr1[i];
                if (u == 0 || union[u - 1] != common) {
                    union[u++] = common;
                }
                if (in == 0 || intersection[in - 1] != common) {
                    intersection[in++] = common;
                }
                i++;
                j++;
            }
        }
        while (i < a) {
            if (u == 0 || union[u - 1] != arr1[i]) {
                union[u++] = arr1[i];
            }
            i++;
        }
        while (j < b) {
            if (u == 0 || union[u - 1] != arr2[j]) {
                union[u++] = arr2[j];
            }
            j++;
        }
        for (int m = 0; m < u; m++) {
            System.out.println(union[m]);
        }
        for (int m = 0; m < in; m++) {
            System.out.println(intersection[m]);
        }
    }
}
