package javaPrograms;

import java.util.Scanner;

public class FCP082 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=0;i<n;n--){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
