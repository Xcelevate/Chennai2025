import java.util.Scanner;

public class FCP056 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum1 = 0;
        int sum2 = 0;
        int j = 0;
        int[] a = new int[n];

        while (j < n) {
            
            a[j] = scanner.nextInt();
            j = j + 1;
        }

        j = 0;
        while (j < n) {
            if (a[j] % 2 == 0) { 
                sum2 = sum2 + a[j];
            } else {
                sum1 = sum1 + a[j];
            }
            j = j + 1;
        }
        System.out.println(sum1);
        System.out.println(sum2);
        

    }
}