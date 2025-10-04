import java.util.Scanner;

public class FCP40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Need at least 2 numbers to find the second maximum.");
            return;
        }

        
        int first = sc.nextInt();
        int max = first;
        int secondMax = Integer.MIN_VALUE;

        
        for (int i = 1; i < n; i++) {
            int num = sc.nextInt();

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                secondMax = num;
            }
        }

        System.out.println(secondMax);
    }
}
