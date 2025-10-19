package javaPrograms;

import java.util.Scanner;

public class FCP042 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long a =0;
        long b= 1;
        long c=0;

        for(int i =1 ; i<=n;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
