import java.util.Scanner;

public class FCP059 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Read input array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find and print duplicates
        for (int i = 0; i < n; i++) {
            boolean printed = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    if (!printed) {  // print only first time we find a duplicate
                        System.out.println(arr[i]);
                        printed = true;
                    }
                    // Remove duplicate occurrence
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    n--;
                    j--;
                }
            }
        }
    }
}
