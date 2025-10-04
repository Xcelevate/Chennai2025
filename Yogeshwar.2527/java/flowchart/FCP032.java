package javaPrograms;

import java.util.Scanner;

public class FCP032 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int cout =0;
        for(int i = 2 ; i < n  ;i++)if(n%i==0)cout++;
        if(cout==1) System.out.println("Yes");
        else System.out.println("No");
    }
}
