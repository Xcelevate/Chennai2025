package javaPrograms;

import java.util.Scanner;

public class FCP035 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean prime = true;
        if(n<=1){
            System.out.println("No");
        }
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
