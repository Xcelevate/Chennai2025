package DomJudge;

import java.util.Scanner;

public class FCP040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();



        int num1 = scanner.nextInt();

        int num2 = scanner.nextInt();

        int max1 , max2;
        if(num1 > num2) {
            max1 = num1;
            max2 = num2;
        } else {
            max1 = num2;
            max2 = num1;
        }

        for( int i = 3; i<=N; i++){

            int next = scanner.nextInt();


            if (next > max1){
                max2 = max1;
                max1= next;

            } else if (next > max2) {
                max2 = next;
            }
        }
        System.out.println(max2);
    }
}
