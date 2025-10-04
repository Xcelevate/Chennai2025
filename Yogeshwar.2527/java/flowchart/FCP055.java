package javaPrograms;

import java.util.Scanner;

public class FCP055 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[]arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int x =s.nextInt();
        boolean yes=false;
        for(int i =0;i<n;i++){
            if(arr[i]==x){
                yes=true;
                break;
            }
        }
        if(yes) System.out.println("Yes");
        else System.out.println("No");

    }
}
