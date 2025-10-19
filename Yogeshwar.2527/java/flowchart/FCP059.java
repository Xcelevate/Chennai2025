package javaPrograms;

import java.util.Scanner;

public class FCP059 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = s.nextInt();

        int[] b = new int[n];
        int b1 = 0;

        for(int i = 0; i < n; i++) {
            int x = arr[i];
            for(int j = i + 1; j < n; j++) {
                if(x == arr[j]) {
                    boolean dup = false;
                    for(int k = 0; k < b1; k++) {
                        if(b[k] == x) {
                            dup = true;
                            break;
                        }
                    }
                    if(!dup) {
                        b[b1] = x;
                        b1++;
                    }
                    break;
                }
            }
        }

        for(int l = 0; l < b1; l++) {
            System.out.println(b[l]);
        }
    }
}
