
//Count of tripets 
import java.util.Scanner;

public class CountTriplets {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        long t = 0, count = 0, a = 1, b = 2, c = 3;

        while (a < n) {
            while (b < n) {
                while (c < n) {
                    t = a + b + c;
                    if (t == n) {
                        count++;
                    }
                    c++;
                }
                b++;
                c = b + 1;
            }
            a++;
            b = a + 1;
            c = b + 1;
        }
        System.out.println(count);
        scan.close();
    }
}
