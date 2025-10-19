package javaPrograms;

import java.util.Scanner;

public class FCP062 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i =0 ; i<n;i++){
        arr[i]=s.nextInt();
        }
        int m = s.nextInt();
        for(int j = 0 ; j <m ; j++ ){
            int x = arr[0];
            for(int i=1 ; i<n;i++) arr[i-1]=arr[i];
            arr[n-1]=x;
        }
        for(int i =0 ; i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
