package DomJudge;

import java.util.Scanner;

public class FCP030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        boolean PerfectSquare = false;


        for(int i = 0; i <= number ; i++) {
            int a = i * i;
            if (number == a) {
                PerfectSquare = true;
                break;

            }
        }

        if (PerfectSquare) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }
    }
}


