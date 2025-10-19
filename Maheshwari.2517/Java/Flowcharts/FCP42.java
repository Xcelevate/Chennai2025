import java.util.Scanner;

public class FCP42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(first);

            int next = first + second;
            first = second;
            second = next;
        }
    }
}

