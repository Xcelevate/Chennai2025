import java.util.Scanner;

public class FCP41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Need at least 3 numbers to find the third maximum.");
            return;
        }

        
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;

        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if (num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if (num > secondMax && num < max) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num > thirdMax && num < secondMax) {
                thirdMax = num;
            }
        }

        System.out.println(thirdMax);
    }
}
