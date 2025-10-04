package javaPrograms;

import java.util.Scanner;

public class FCP043 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n=s.nextLong();
        long x=s.nextLong();
        double sum = 0;
        for(int i = 1 ; i<=n;i++){
            sum+= (double) Math.pow(x,i) /i;
        }
        System.out.println(Math.round(sum));
    }
}
