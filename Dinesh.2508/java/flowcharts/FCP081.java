package DomJudge;

import java.util.Scanner;

public class FCP081 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for( int row = 1 ; row <= a; row++){
            for(int col = 1; col <= a - row ; col++) {
                System.out.print("  ");
            }
            for (int star = 1; star <= row ; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
