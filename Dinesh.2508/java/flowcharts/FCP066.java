package DomJudge;

import java.util.Scanner;

public class FCP066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int array1 [] = new int[a];
        int array2 [] = new int[b];

        for(int i = 0; i < a ; i++){
            array1[i] = scanner.nextInt();
        }
        for(int i = 0; i < b ; i++){
            array2[i] = scanner.nextInt();
        }

        int size;
        if(a < b){
            size = a ;
        } else {
            size = b;
        }
        int intersection[] = new int [size];

        int total [] = new int [a + b];
        int i = 0, j = 0, k = 0,l =0;

        while (i < a && j < b ){
            if (array1[i] == array2[j]) {
                intersection[l++] = array1[i];
                total[k++] = array1[i];
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                total[k++] = array1[i++];
            } else{
                total[k++]  = array2[j++];
            }

        }
        while (i < a){
            total[k++] = array1[i++];
        }
        while (j < b){
            total[k++] = array2[j++];
        }
        for ( i = 0; i < k; i++) {
            System.out.println(total[i]);
        }


        for ( i = 0; i < l; i++) {
            System.out.println(intersection[i]);

        }




    }


}




