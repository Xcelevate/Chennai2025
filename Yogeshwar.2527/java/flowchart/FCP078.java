package javaPrograms;

import java.util.Scanner;

public class FCP078 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num =1;
        int[][]arr = new int[n][n];
        int l=0,r=n-1,t=0,b=n-1;
        while (l<=r && t<=b){
            for(int i = l ; i<= r ; i++){
                arr[t][i]=num;
                num+=1;
            }
            t=t+1;
            for(int i = t ; i<=b;i++){
                arr[i][r]=num;
                num+=1;
            }
            r=r-1;
            for(int i = r ; i>=l ; i--){
                arr[b][i]=num;
                num+=1;
            }
            b=b-1;
            for(int i = b;i>=t;i--){
                arr[i][l]=num;
                num+=1;
            }
            l=l+1;
        }
        for(int i = 0 ; i<n;i++){
            for(int j = 0 ; j< n ; j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
