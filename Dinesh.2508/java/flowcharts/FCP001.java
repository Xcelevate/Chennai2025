package DomJudge;

import java.util.Scanner;

public class FCP001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int date = scanner.nextInt();

        scanner.nextLine();
        String month = scanner.nextLine();
        int year = scanner.nextInt();

        System.out.println(date);
        System.out.println(month);
        System.out.println(year);
    }

}
