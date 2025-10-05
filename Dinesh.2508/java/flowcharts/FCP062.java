package DomJudge;

import java.util.Scanner;

public class FCP062{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int array [] = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();
        }
        int No_of_Rotation = scanner.nextInt();
        No_of_Rotation = No_of_Rotation % a;

        for (int i = 0; i < a; i++) {
            int index = (i + No_of_Rotation) % a;
            System.out.println(array[index]);
        }
    }
}
