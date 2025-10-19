package DomJudge;

import java.util.Scanner;

public class FCP018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int hra = 0;
        int da = 0 ;

        if(a <= 10000){
            hra = (a * 20) / 100;
            da = (a * 80) / 100;
        } else if (a <= 20000) {
            hra = (a * 25) / 100;
            da = (a *90) / 100;
        }else{
            hra = (a *30) / 100;
            da = (a*95) / 100;
        }

        int grosssalary = a + hra + da ;

        System.out.println(grosssalary);
    }
}
