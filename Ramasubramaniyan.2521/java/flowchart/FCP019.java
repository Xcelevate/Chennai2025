import java.util.Scanner;

public class FCP019 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        double r1 = 0.50;
        double r2 = 0.75;
        double r3 = 1.20;
        double r4 = 1.50;

        double bill = 0;

        if (n <= 50) {
            bill = n * r1;
        } else if (n <= 150) {
            bill = (50 * r1) + ((n - 50) * r2);
        } else if (n <= 250) {
            bill = (50 * r1) + (100 * r2) + ((n - 150) * r3);
        } else {
            bill = (50 * r1) + (100 * r2) + (100 * r3) + ((n - 250) * r4);
        }

        double surcharge = bill * 0.20;
        double total = bill + surcharge;

        System.out.println(total);
    }
}
