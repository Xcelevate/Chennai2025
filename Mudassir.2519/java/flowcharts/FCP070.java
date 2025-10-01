import java.util.*;

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
        boolean got = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                got = true;
                break;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (got == true) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
