package DomJudge;

import java.util.Scanner;

public class FCP064 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int array1[] = new int[m];
        int array2[] = new int[n];

        for (int i = 0; i < m; i++) {
            array1 [i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            array2[i] = scanner.nextInt();
        }

        int [] Combine  = new int[m + n];
           int i = 0, j =0 , k = 0;

           while (i < m && j < n){
               if (array1[i] <= array2[j]){
                   Combine[k++] = array1[i++];

               }else{
                   Combine[k++] = array2[j++];
               }
           }

           while( i < m){
               Combine[k++] = array1[i++];
           }
           while(j < n){
               Combine[k++] = array2[j++];
           }
           for(int num : Combine){
               System.out.println(num);
           }

    }
}
