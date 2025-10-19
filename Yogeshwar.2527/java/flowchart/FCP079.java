package javaPrograms;

import java.util.Scanner;

public class FCP079 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] a = new int[n];
        long anum=0;
        int[] b = new int[m];
        long bnum=0;
        for(int i = 0 ; i<n ; i++) {
            a[i]=s.nextInt();
            anum=anum*10+a[i];
        }
        for(int i = 0 ; i<n ; i++) {
            b[i]=s.nextInt();
            bnum=bnum*10+b[i];
        }
        long sum = anum+bnum,z = 0;
        while(sum>0){
            long d = sum%10;
            z=z*10+d;
            sum/=10;
        }
        while (z>0){
            System.out.println(z%10);
            z/=10;
        }



    }
}
