package javaPrograms;

import java.util.Scanner;

public class FCP070 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long [] arr= new long[n];
        for(int i = 0 ; i<n;i++) arr[i]=s.nextInt();
        long x = s.nextInt();
        int st=0,end=n-1,m=(st+end)/2;
        while(st<=end){
            m = (st+end)/2;
            if(arr[m]==x){
                System.out.println("Yes");
                return;
            }
            else if(x<arr[m]){
                end=m-1;
            }
            else st=m+1;
        }
        System.out.println("No");
    }
}
