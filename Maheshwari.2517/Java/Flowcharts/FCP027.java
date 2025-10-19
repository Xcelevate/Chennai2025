import java.util.Scanner;

public class FCP027{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();

            int digits;
            if (N == 0) {
                digits = 1;
            } else {
                digits = (int) Math.floor(Math.log10(Math.abs(N))) + 1;
            }

            System.out.println(digits);
        }
    }
}


