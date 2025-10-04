package javaPrograms;

import java.util.Scanner;

public class FCP067 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = n;
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) arr[i]=s.nextInt();
        for(int j = 0 ; j < n-1 ; n--){
            for(int i = 0 ; i<n-1 ;i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for(int i = 0 ; i < a ; i++) System.out.println(arr[i]);



    }
}
