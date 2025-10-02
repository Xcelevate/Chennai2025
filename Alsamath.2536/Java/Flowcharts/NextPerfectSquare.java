import java.util.*;

public class NextPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long i = 1;
        while (i * i <= n) {
            i++;
        }
        System.out.println(i * i);
    }
}
