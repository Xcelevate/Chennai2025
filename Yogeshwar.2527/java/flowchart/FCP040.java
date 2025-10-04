package javaPrograms;

import java.util.Scanner;

public class FCP040 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int a = s.nextInt();
            if(a>max){
                smax =max;
                max=a;
            }
            else if (a>smax){
                smax=a;
            }
        }
        System.out.println(smax);
    }
}
