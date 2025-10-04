package javaPrograms;

import java.util.Scanner;

public class FCP071 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[]arr= new int[5];
        for(int i = 0 ; i<n;i++)arr[i]=s.nextInt();
        for(int i  = 0 ; i < n ; i++){
            for(int j = 0; j<arr[i] ; j++){
                System.out.print(">");
            }
            System.out.println();
        }
    }
}
