import java.util.*;
public class FCP019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        double hra, da, gross;
        
        if (basic <= 10000) {
            hra = 0.20 * basic;
            da = 0.80 * basic;
        } else if (basic <= 20000) {
            hra = 0.25 * basic;
            da = 0.90 * basic;
        } else {
            hra = 0.30 * basic;
            da = 0.95 * basic;
        }
        
        gross = basic + hra + da;
        System.out.println((int)gross);
    }
}
