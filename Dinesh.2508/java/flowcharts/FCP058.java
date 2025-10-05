package DomJudge;

import java.util.Scanner;

public class FCP058 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int array [] = new int[a + 1];

        for (int i = 0; i < a; i++) {
            array [i] = scanner.nextInt();
        }

        int index = scanner.nextInt();
        int To_Insert = scanner.nextInt();
        int Insert_index = index-1;

        for (int i = a; i > Insert_index; i--) {
            array[i] = array[i - 1];
        }
        array[Insert_index] = To_Insert;

        for (int i = 0; i < a + 1; i++) {
            System.out.println(array[i]);
        }
    }
}
