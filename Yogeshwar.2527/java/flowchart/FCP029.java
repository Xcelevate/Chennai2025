package javaPrograms;

import java.util.Scanner;

public class FCP029{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count=0;
        while(n>0){
            int d=n%10;
            count+=d;
            n/=10;
        }
        System.out.println(count);
    }
}
