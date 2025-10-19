package DomJudge;

import java.util.Scanner;

public class FCP028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int count = 0;

        if( a == 0){
            count = 1 ;
        }else{
            while ( a != 0){
                a = a / 10;
                count++;
            }
        }
        System.out.println(count);
    }
}
