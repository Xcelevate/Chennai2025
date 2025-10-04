package javaPrograms;

import java.util.Scanner;

public class FCP058 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n+1];
        for(int i=0;i<n;i++) arr[i]=s.nextInt();
        int m= s.nextInt();;
        int x=s.nextInt();
        for(int j=n;j>m-1;j--) arr[j]=arr[j-1];
        arr[m-1]=x;
        for(int i=0;i<n+1;i++) System.out.println(arr[i]);
    }
}
