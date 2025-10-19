package javaPrograms;

import java.util.Scanner;

public class FCP095 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr =new int[n];
        for(int i =0 ; i<n ; i++){
            arr[i]=s.nextInt();
        }
        for(int i = 0 ; i <n ; i++){
            int d = i;
            for( int j = i+1;j<n ; j++){
                if(arr[d]>arr[j]){
                    d=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[d];
            arr[d]=temp;
        }
        for(int i =0 ; i<n ; i++){
            System.out.println(arr[i]);
        }

    }
}
