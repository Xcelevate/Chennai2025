package DomJudge;

import java.util.Scanner;

public class FCP036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        long num1 = sc.nextLong();
        long num2 = sc.nextLong();

        long x,y;
        if(num1>num2){
            x=num1;
            y=num2;
        }
        else{
            y=num1;
            x=num2;

        }
            while (y != 0) {
            long temp = y;
            y = x % y;
            x = temp;
        }
        long hcf = x;

         long product = num1 * num2;
         if(product < 0){
             product = -product;
         }

        long lcm ;
        if (hcf == 0 ){
            lcm = 0;
        }else{
            lcm = product / hcf;
        }


        System.out.println(hcf);
        System.out.println(lcm);
    }
}

