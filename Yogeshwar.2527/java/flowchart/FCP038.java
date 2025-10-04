package javaPrograms;

import java.util.Scanner;

public class FCP038 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = n;
        int count=0;
        while(n>0){
            int d=n%10;
            count+=d*d*d;
            n/=10;
        }
        if(a==count)System.out.println("Yes");
        else System.out.println("No");
    }
}
