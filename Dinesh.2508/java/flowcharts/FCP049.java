package DomJudge;

import java.util.Scanner;

public class FCP049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count = 0;
        for (int num = 2; num < a; num++) {
            int isPrime = 1;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = 0;
                    break;
                }
            }

            if (isPrime == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}
