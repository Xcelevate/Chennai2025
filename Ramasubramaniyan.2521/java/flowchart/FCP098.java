import java.util.Scanner;

public class AlternateOddEvenCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N < 10) {
            System.out.println("yes");
            return;
        }

        int prevDigit = N % 10;
        N /= 10;

        boolean isAlternating = true;
        while (N > 0) {
            int currDigit = N % 10;
            if ((currDigit % 2) == (prevDigit % 2)) {
                isAlternating = false;
                break;
            }
            prevDigit = currDigit;
            N /= 10;
        }

        System.out.println(isAlternating ? "yes" : "no");
    }
}
