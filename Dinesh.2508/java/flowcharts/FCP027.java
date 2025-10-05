package DomJudge;

import java.util.Scanner;

public class FCP027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double sum = 0;

        for (int i = 1; i <= a ; i++) {
            sum = sum + 1.0 / i ;
        }
        System.out.println ((int) (sum * 100 + 0.5) / 100.0);
    }
}
