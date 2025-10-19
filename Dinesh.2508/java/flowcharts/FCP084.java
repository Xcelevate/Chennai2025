package DomJudge;

import java.util.Scanner;

public class FCP084 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println(0);
        int num = 2 ;
        for (int row = 1; row < a ; row++) {
            for (int col = 0; col <= row ; col++) {
                if(col ==0) System.out.print(num + " ");
                else{
                    System.out.print(num*2 + " ");
                }
            }
            System.out.println();
            num *= 2;
        }
    }
}
