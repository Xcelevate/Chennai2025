package javaPrograms;

import java.util.Scanner;

public class FCP096 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++) arr[i]=s.nextInt();
        for(int i = 0 ; i < n ; i++){
            int min = i;
            for(int j = i+1 ; j < n ; j++ ){

                if(arr[j]<arr[min]) min = j;
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]= temp;

        }
        for(int i = 0 ; i < n; i++) System.out.println(arr[i]);;

    }
}
