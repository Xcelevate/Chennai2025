package javaPrograms;

import java.util.Scanner;

public class FCP072 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int max=Integer.MIN_VALUE;
        for(int i = 0 ; i<n ;i++){
            int d =s.nextInt();
            arr[i]=d;
            if(d>max) max=d;

        }
        for(int i = max ; i >0; i--){
            int k = 0;
            for(int j = 0 ; j < max;j++){
                if(i<=arr[k]){
                    System.out.print("*  ");

                }
                else {
                    System.out.print("   ");
                }
                k+=1;

            }
            System.out.println();
        }
    }
}
