package DomJudge;

import java.util.Scanner;

public class FCP021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max, secondMax;

        if (a > b) {
            max = a;
            secondMax = b;
        } else {
            max = b;
            secondMax = a;
        }


        for (int i = 0; i < 6; i++) {
            int num = scanner.nextInt();

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }

        System.out.println(secondMax);
    }
}



