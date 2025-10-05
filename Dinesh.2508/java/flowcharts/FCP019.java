package DomJudge;

import java.util.Scanner;

public class FCP019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int unit = scanner.nextInt();
        double bill = 0;

        if (unit <= 50) {
            bill = unit * 0.50;
        } else if ( unit <= 150) {
            bill = 50 * 0.50 + (unit - 50)* 0.75;
        } else if ( unit <= 250) {
            bill = 50 * 0.50 + 100 * 0.75 + (unit - 150)* 1.20;
        } else{
            bill = 50 * 0.50 + 100 * 0.75 +100 * 1.20 + (unit - 250) * 1.50;
        }

        double charge = bill * 0.20;
        double total = bill + charge;

        System.out.println(total);


    }
}
