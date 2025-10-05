package DomJudge;

import java.util.Scanner;

public class FCP057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int array [] = new int[a];

        int b = scanner.nextInt();
        int To_Remove = b - 1;

        for (int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();
        }


        for (int i = To_Remove; i < a -1 ; i++) {
            array[i] = array[i + 1];
        }

        for (int i = 0; i < a - 1; i++) {
            System.out.println(array[i]);
        }
    }
}
