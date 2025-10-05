package DomJudge;

import java.util.Scanner;

public class FCP004{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextInt();
        long b = scanner.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((double) a / b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}
