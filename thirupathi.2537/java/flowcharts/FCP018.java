import java.util.Scanner;
public class FCP018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        double hra = 0;
        double da = 0;
        if (basic <= 10000) {
            hra = 0.20 * basic;
            da = 0.80 * basic;
        } else {
            if (basic <= 20000) {
                hra = 0.25 * basic;
                da = 0.90 * basic;
            } else {
                hra = 0.30 * basic;
                da = 0.95 * basic;
            }
        }

        double gross = basic + hra + da;
        System.out.println((int)gross);
    }
}
