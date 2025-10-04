package javaPrograms;

import java.util.Scanner;

public class FCP081 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int g = s.nextInt();
        int n=g+1;
        for(int i=0;i<n;i++){

            for(int j=0;j<n-1-i;j++){
                System.out.print("  ");
            }
            for(int k=n-i ;k<n;k++) System.out.print("* ");
            System.out.println();
        }

    }
}
