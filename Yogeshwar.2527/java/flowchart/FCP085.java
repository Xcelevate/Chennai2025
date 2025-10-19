package javaPrograms;

import java.util.Scanner;

public class FCP085 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n >= 1 && n <= 10){
            for(int i = 1; i <= n; i++){

                for(int j = 1; j <= i; j++) {
                    System.out.print(j);
                    if(i != 1 || j != i) System.out.print(" ");
                }


                for(int k = i - 1; k >= 1; k--) {
                    System.out.print(k);
                    if(k != 1) System.out.print(" ");
                }

                System.out.println();
            }
        }
    }
}
