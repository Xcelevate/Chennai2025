package javaPrograms;

import java.util.Scanner;

public class FCP033 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = n;
        int r=0;
        while(n>0){
            int d = n%10;
            r=r*10 +d;
            n/=10;
        }
        if(a==r) System.out.println("Yes");
        else System.out.println("No");
    }
}
