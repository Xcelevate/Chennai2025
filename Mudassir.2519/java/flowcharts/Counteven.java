import java.util.*;

public class Counteven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= N; i++) {
            int num = i;
            boolean got = true;
            while (num > 0) {
                int r = num % 10;
                if (r % 2 != 0) {
                    got = false;
                    break;
                }
                num /= 10;
            }
            if (got) count++;
        }

        System.out.println(count);
    }
}
