package DomJudge;

import java.util.Scanner;

public class FCP015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int max =0;

        if (a > b) {
            max = a;
        } else {
            max= b;
        }

        if (c > max) {
            max = c;
        }

        if (d > max) {
            max = d;
        }


        System.out.println(max);

    }
}
