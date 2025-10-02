import java.util.*;
public class rightangledtrianglenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        if (n < 1 || n > 10) {
            return;
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(c + " ");
                    c++;
                }
                System.out.println();
            }
        }
    }
}