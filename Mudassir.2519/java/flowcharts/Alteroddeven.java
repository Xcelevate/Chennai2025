import java.util.*;

public class Alteroddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 10) {
            System.out.println("yes");
            return;
        }

        int prev = n % 10;
        n /= 10;

        while (n > 0) {
            int curr = n % 10;
            if ((curr % 2) == (prev % 2)) {
                System.out.println("no");
                return;
            }
            prev = curr;
            n /= 10;
        }

        System.out.println("yes");
    }
}
