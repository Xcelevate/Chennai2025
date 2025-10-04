package javaPrograms;

import java.util.Scanner;

public class FCP025 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long sum=0;
        for(int i = 1 ; i <=n ; i ++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
