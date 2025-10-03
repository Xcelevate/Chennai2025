import java.util.Scanner;

public class Fcp025{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read multiple inputs until no more integers
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int sum = 0;

            for (int i = 1; i <= N; i += 2) {  // loop through odd numbers only
                sum += i;
            }

            System.out.println(sum);
        }
    }
}
