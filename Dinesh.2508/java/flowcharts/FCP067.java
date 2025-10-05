package DomJudge;

import java.util.Scanner;

public class FCP067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int array[] = new int[a];
        int size = array.length;
        int temp = 0 ;

        for (int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();
        }

        for(int i = 0; i < size ; i++){
            for(int j = 0; j < size-i-1; j++){
                if(array[j] > array[j + 1])
                {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }


            }
        }
        for( int num : array){
            System.out.println(num);
        }
    }
}


