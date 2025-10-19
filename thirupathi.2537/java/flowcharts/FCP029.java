import java.util.Scanner;
public class FCP029 {
    public static int sumOfDigits(int N) {
        int rem, sum = 0;
        while (N > 0) {
            rem = N % 10;
            sum = sum + rem;
            N = N / 10;
        }
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = sumOfDigits(N);
        System.out.println(result);
    }
}
