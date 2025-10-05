package DomJudge;

import java.util.Scanner;

public class FCP020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();


        int max, secondMax;

        if (a > b) {
            max = a;
            secondMax = b;
        } else {
            max = b;
            secondMax = a;
        }


        if (c > max) {
            secondMax = max;
            max = c;
        } else if (c > secondMax) {
            secondMax = c;
        }


        if (d > max) {
            secondMax = max;
            max = d;
        } else if (d > secondMax) {
            secondMax = d;
        }


        System.out.println(secondMax);
    }
}

