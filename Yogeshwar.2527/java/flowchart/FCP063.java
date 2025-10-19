package javaPrograms;

import java.util.Scanner;

public class FCP063 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        int cou = 0;
        int cou1=0;
        for(int i= 0 ; i<n;i++){
            int d = s.nextInt();
            arr[i]=d;

            if(d==1) cou1++;
            else {
                if(cou1>cou) cou=cou1;
                cou1=0;
            }



        }
        if(cou1>cou) cou=cou1;
        System.out.println(cou);
    }
}
