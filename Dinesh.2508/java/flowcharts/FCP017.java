package DomJudge;

import java.util.Scanner;

public class FCP017{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int secondMax;

        if ((A > B && A < C) || (A > C && A < B)) {
            secondMax = A;
        } else if ((B > A && B < C) || (B > C && B < A)) {
            secondMax = B;
        } else {
            secondMax = C;
        }

        System.out.println(secondMax);
    }
}
