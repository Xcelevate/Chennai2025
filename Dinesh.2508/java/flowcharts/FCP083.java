package DomJudge;

import java.util.Scanner;

public class FCP083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int num = 1 ;
        for (int row = 0; row <= a; row++) {
            for ( int col = 1; col <= row; col++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
