package DomJudge;

import java.util.Scanner;

public class FCP032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int i = 1 ;
        while( i * i < a){
            i = i + 1;
        }
        if( i * i == a){
            boolean prime = true;
            if ( i < 2) prime = false;
            for (int j = 2; j * j <= i ; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if(prime){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
