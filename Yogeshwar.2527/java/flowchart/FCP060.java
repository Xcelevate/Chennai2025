package javaPrograms;

import java.util.Scanner;

public class FCP060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int[n][n];
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j<=i; j++){
                if(i==j||j==0){
                    arr[i][j]=1;

                }
                else {
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                }
            }
        }
        for(int i = 0 ; i<n;i++){
            for(int j = 0 ; j<=i; j++){
                System.out.printf("%d\t",arr[i][j]);
            }
            System.out.println();
        }

    }
}
