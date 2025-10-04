import java.util.Scanner;

public class FCP47{
    
    public static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();
        int[] numbers = new int[n];

        
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

     
        int result = numbers[0];
        for (int i = 1; i < n; i++) {
            result = hcf(result, numbers[i]);
        }

        
        System.out.println(result);

        sc.close();
    }
}
