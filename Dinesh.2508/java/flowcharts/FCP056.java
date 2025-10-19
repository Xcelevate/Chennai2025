package DomJudge;

import java.util.Scanner;

public class FCP056 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a = scanner.nextInt();
        int [] array = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();

        }
        int oddsum = 0;
        int evensum = 0;

        for ( int num : array) {
            if ( num % 2 == 0){
                evensum += num;

            }else{
                oddsum += num;
            }
        }
        System.out.println(oddsum);
        System.out.println(evensum);
    }
}
