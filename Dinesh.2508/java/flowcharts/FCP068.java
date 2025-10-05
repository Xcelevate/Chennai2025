package DomJudge;

import java.util.Scanner;

public class FCP068 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int array[] = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();

        }
        int b = scanner.nextInt();
        int sum;
        boolean found = false;


        for (int i = 0; i < a; i++) {
            sum = 0;
            for (int j = i; j < a; j++) {
                sum += array[j];
                if (sum == b) {
                    for (int k = i; k <= j; k++){
                        System.out.println(array[k]);

                }
                found = true;
                break;

            }
        }
        if (found) {
            break;

            }

        }

    }
}
