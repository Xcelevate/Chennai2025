import java.util.Scanner;

public class FCP59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        boolean[] printed = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (printed[i]) continue; 

            boolean isDuplicate = false;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    printed[j] = true;
                }
            }

            if (isDuplicate) {
                System.out.println(arr[i]);
            }
        }
    }
}
