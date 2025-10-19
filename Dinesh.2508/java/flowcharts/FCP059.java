package DomJudge;

import java.util.Scanner;

public class FCP059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int array [] = new int[a];

        for (int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();
        }
        boolean printed[] = new boolean[a];

        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                if(array[i] == array[j]){
                    System.out.println(array[i]);
                    printed[j] = true;
                    break;
                }
            }
        }
    }
}