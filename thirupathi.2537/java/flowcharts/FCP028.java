import java.util.Scanner;
public class FCP028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = digitCount(N);
        System.out.println(result);
    }
    public static int digitCount(int N) {
        if (N < 10) {
            return 1;
        } else if (N < 100) {
            return 2;
        } else if (N < 1000) {
            return 3;
        } else if (N < 10000) {
            return 4;
        } else if (N < 100000) {
            return 5;
        } else {
            return 6;
        }
    }
}
