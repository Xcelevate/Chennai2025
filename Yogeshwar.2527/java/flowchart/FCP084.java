package javaPrograms;

import java.util.Scanner;

public class FCP084 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(0);
        int a =2;
        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j<=i;j++){
                if(j==0) {
                    System.out.print(a+" ");
                    a=a*2;
                }
                else {
                    System.out.print(a+" ");
                }

            }
            System.out.println();
        }
    }
}
