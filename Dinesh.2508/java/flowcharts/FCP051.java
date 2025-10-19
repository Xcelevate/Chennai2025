package DomJudge;

import java.util.Scanner;

public class FCP051 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        while (a >= 10){
            int sum = 0;
            int temp = a;
            while (temp > 0){
                sum += temp % 10;
                temp /= 10;
            }
            a = sum;
        }
        System.out.println(a);
    }
}
