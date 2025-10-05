package DomJudge;

import java.util.Scanner;

public class FCP061 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int array [] = new int[a];
        boolean [] repeated = new boolean[a];

        for (int i = 0; i < a; i++) {
            array[i] = scanner.nextInt();
            repeated[i] = false;
        }

        for (int i = 0; i < a; i++) {
            if (repeated[i]){
                continue;
            }
            int count = 1;
            for (int j = i + 1 ; j < a; j++) {
                if(array[i] == array[j]){
                    count++;
                    repeated[j] = true;
                }
            }
            System.out.println(array[i] + " - " + count);
        }
    }

}


