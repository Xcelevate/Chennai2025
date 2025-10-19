package DomJudge;

import java.util.Scanner;

public class FCP014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = 0 ;


        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max= c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }

        System.out.println(max);
    }
}


