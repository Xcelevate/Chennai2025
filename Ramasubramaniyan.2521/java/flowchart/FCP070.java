import java.util.Scanner;

public class FCP070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();              
	}

        int x = sc.nextInt();         
        int low = 0, high = n - 1;
        boolean found = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                found = true;
                break;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(found ? "Yes" : "No");
    }
}
