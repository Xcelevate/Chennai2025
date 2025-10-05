package DomJudge;

import java.util.Scanner;

public class FCP054 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int [] array = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < a / 2; i++) {
            int temp = array[i];
            array[i] = array[a - 1 - i];
            array[a - 1 - i] = temp;

        }
        for (int i = 0; i < a; i++) {
            System.out.println(array[i]);
        }
    }

}
