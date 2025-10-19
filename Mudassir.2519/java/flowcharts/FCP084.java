import java.util.*;

public class FCP084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int st = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println(0);
                st = 2;
            } else {
                System.out.print(st + " ");
                for (int j = 2; j <= i; j++) {
                    System.out.print(st * 2 + " ");
                }
                System.out.println();
                st *= 2;
            }
        }
    }
}
