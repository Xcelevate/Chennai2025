package DomJudge;

import java.util.Scanner;

public class FCP007{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int celsius = scanner.nextInt();
        double fahrenheit = (celsius * 9.0 / 5 ) + 32;

        System.out.printf(" %.2f",fahrenheit);
    }
}
