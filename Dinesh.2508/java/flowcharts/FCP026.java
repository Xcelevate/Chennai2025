package DomJudge;

import java.util.Scanner;

public class FCP026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextInt();
        long n = scanner.nextInt();

        long sum = 0;
        for (long i = m; i <=n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
