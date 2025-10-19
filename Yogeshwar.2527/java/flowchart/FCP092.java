package javaPrograms;

import java.util.Scanner;

public class FCP092 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m =s.nextInt();
        int n = m;
        for(int i = 0 ; i<n ; i++){
            for (int j= 0 ; j<n ; j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
