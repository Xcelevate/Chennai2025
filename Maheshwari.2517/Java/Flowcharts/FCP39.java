import java.util.Scanner;

public class FCP39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

      
        if (n <= 0) {
            System.out.println("Please enter a valid number greater than 0.");
            return;
        }

        int[] numbers = new int[n];

        
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        
        int max = numbers[0];
        int min = numbers[0];

        
        for (int i = 1; i < n; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Print results
        System.out.println(max);
        System.out.println(min);
    }
}
