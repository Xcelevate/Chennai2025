package DomJudge;

import java.util.Scanner;

public class FCP013 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();

        if( a == 0){
            System.out.println(0);
        }else{
            int b = 2;
            int c = a;
            int d = 1;

            for (int i = 1; i <= b && i <= c ; i++) {
                if( b % i == 0 && c % i == 0){
                    d = i;
                }
            }
            int e = ( b * c) / d;
            System.out.println(e);
        }
    }
}
