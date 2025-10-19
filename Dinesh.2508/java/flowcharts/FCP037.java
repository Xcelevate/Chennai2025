package DomJudge;

import java.util.Scanner;

public class FCP037{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        if( number == 0){
            System.out.println("No");
            return;
        }
        int sum = 0;

        for (int i = 1; i < number; i++) {
            int a = number % i;
            if (a == 0) {
                sum += i;
            }

        }
        if(sum == number){
            System.out.print("yes");
        } else {
            System.out.print("No");
        }
    }
}
