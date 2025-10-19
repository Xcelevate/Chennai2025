package javaPrograms;

import java.util.Scanner;

public class FCP046 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1 ; i <= n ; i++){
            for(int j=1;j<=n;j++){
                if(i==j) {
                    System.out.println("*");
                    break;
                }

                else if(j==1) System.out.print("* ");
                else if (i==n) System.out.print("* ");
                else System.out.print("  ");

            }
        }
    }
}
