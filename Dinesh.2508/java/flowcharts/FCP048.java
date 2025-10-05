package DomJudge;

import java.util.Scanner;

public class FCP048{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end  = scanner.nextInt();

        int num;
        for(  num = start; num <= end; num++){
        int temp = num;
        int digits = 0 ;

        int t = temp;
        while(t > 0) {
            digits++;
            t = t / 10;
        }

        int sum = 0 ;
        t = temp;
        while (t > 0){
            int digit = t % 10;
            int mul = 1 ;
            for(int  i = 0; i < digits; i++){
                mul = mul * digit;
            }
            sum+=mul;
            t/=10;
        }

        if (sum == num){
            System.out.println(num);
        }
        }
    }
}
