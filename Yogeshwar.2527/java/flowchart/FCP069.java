package javaPrograms;

import java.util.Scanner;

    public class FCP069 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] arr = new int[n];
            boolean[]check = new boolean[n];
            for(int i = 0 ; i < n ; i++)check[i]=false;
            for(int i = 0 ; i< n ; i++)arr[i]=s.nextInt();
            int g = s.nextInt();
            int c = 0;
            int res = 0 ; int i = 0;
            while (res<n){
                int a = i%n;
                if(check[a]==false){
                    c=c+1;
                    if(c==g){
                        System.out.println(arr[a]);
                        check[a]=true;
                        c=0;
                        res+=1;
                    }
                }
                i+=1;
            }
        }
    }
