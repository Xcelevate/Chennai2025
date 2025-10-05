package DomJudge;

import java.util.Scanner;

public class FCP006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int Ldigit = num % 10;

        System.out.println(Ldigit);
    }
}
