package javaPrograms;

import java.util.Scanner;

public class FCP053 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i=1;i<=n;i++)arr[i-1]=i;
        for(int i=0;i<n;i++) System.out.println(arr[i]);
    }
}
