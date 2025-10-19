package DomJudge;

import java.util.Scanner;

public class FCP024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        for (int  i = 0; i < a ; i++) {
            if ( i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
}
