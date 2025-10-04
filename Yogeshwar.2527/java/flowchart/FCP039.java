package javaPrograms;

import java.util.Scanner;

public class FCP039 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i = 0 ; i<n;i++){
            int d = s.nextInt();
            if(d>max) max = d;
            if(d<min) min = d;

        }
        System.out.println(max);
        System.out.println(min);
    }
}
