package javaPrograms;

import java.util.Scanner;

public class FCP057 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int m=s.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=s.nextInt();
        for(int j=m-1;j<n-1;j++) arr[j]=arr[j+1];
        for(int j=0;j<n-1;j++) System.out.println(arr[j]);
    }
}
