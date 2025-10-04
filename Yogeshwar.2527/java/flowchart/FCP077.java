package javaPrograms;

import java.util.Scanner;

public class FCP077 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [][] arr = new int[n][n];
        int i =0;
        int j=n/2;
        int num =1;
        while (num<=n*n){
            arr[i][j]=num;
            num+=1;
            int ni=(i-1+n)%n;
            int nj=(j+1)%n;
            if(arr[ni][nj]!=0){
             i=(i+1)%n;
            }
            else {
                i=ni;
                j=nj;
            }

        }
        for(int k = 0 ; k<n; k++){
            for(int l = 0 ; l < n; l++ ){
                System.out.printf("%d\t",arr[k][l]);
            }
            System.out.println();
        }
    }
}
