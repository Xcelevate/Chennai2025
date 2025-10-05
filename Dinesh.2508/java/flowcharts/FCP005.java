package DomJudge;

import java.util.Scanner;

public class FCP005{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int quotient = a / b ;
        int remainder = a % b ;

        System.out.println(quotient);
        System.out.println(remainder);
    }
}
