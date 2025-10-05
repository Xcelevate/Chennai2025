package DomJudge;

import java.util.Scanner;

public class FCP033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int b = 0 ;
        int c = number;
        while (number != 0 ){
            int a = number % 10;
            b = b * 10 + a ;
            number /= 10;
        }
        if( c == b){System.out.print("Yes");}
        else {System.out.print("No");}

    }}


