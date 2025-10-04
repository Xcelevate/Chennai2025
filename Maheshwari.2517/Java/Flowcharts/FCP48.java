import java.util.Scanner;

public class FCP48.java {

    
    public static int countDigits(int num) {
        int count = 0;
        if (num == 0) return 1;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }

   
    public static boolean isArmstrong(int num) {
        int original = num;
        int digits = countDigits(num);
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += power(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int M = sc.nextInt();
        int N = sc.nextInt();

       
        for (int i = M; i <= N; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
