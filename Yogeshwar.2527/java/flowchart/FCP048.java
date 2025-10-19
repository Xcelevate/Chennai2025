package javaPrograms;

import java.util.Scanner;

public class FCP048 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();

        for (int i = m; i <= n; i++) {
            int num = i;
            int digits = countDigits(num);
            int sum = 0;
            int temp = num;

            while (temp > 0) {
                int d = temp % 10;
                sum += Math.pow(d, digits);
                temp /= 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }


    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
