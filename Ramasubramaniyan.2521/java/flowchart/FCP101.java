import java.util.Scanner;

public class NextPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int k = 1;
        while (k * k <= N) {
            k++;
        }

        System.out.println(k * k);
    }
}
