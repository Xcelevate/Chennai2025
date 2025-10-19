package javaPrograms;

import java.util.Scanner;

public class FCP074 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int[][] arr1=new int[n][n];
        int[][] arr2=new int[n][n];
        for(int i = 0 ;i<n;i++)
            for(int j=0;j<n;j++)
                arr1[i][j]=s.nextInt();
        for(int i = 0 ;i<n;i++)
            for(int j=0;j<n;j++)
                arr2[i][j]=s.nextInt();

        for(int i = 0 ;i<n;i++)
            for(int j=0;j<n;j++)
                System.out.println(arr1[i][j]-arr2[i][j]);



    }

}
