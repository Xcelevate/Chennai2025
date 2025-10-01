import java.util.*;

public class FCP028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println(1);
        } else if (n < 10) {
            System.out.println(1);
        } else if (n < 100) {
            System.out.println(2);
        } else if (n < 1000) {
            System.out.println(3);
        } else if (n < 10000) {
            System.out.println(4);
        } else if (n < 100000) {
            System.out.println(5);
        } else if (n < 1000000) {
            System.out.println(6);
        } else {
            System.out.println(7);
        }
    }
}
