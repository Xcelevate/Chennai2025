package javaPrograms;

import java.util.Scanner;

public class FCP056 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]=s.nextInt();
        int even=0,odd=0;
        for(int i=0;i<n;i++) if(arr[i]%2==0)even+=arr[i];else odd+=arr[i];
        System.out.println(odd);
        System.out.println(even);
    }
}
