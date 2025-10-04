import java.util.Scanner;

public class FCP37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        int count = 0;
        int t = n;
        while (t > 0) {
            t = t / 10;
            count++;
        }

    
        t = n;  
        while (t > 0) {
            int digit = t % 10;

           
            int power = 1;
            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }

            sum += power;
            t = t / 10;
        }

        
        if (sum == temp) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
