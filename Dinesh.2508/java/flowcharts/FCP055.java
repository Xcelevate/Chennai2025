package DomJudge;

import java.util.Scanner;

public class FCP055 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[]array = new int [a];

        for (int i = 0; i < a; i++) {
            array [i] = scanner.nextInt();
        }
        int Target_Value = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < a; i++) {
           if (array [i] == Target_Value){
               found = true;
               break;
           }
        }

        if ( found){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
