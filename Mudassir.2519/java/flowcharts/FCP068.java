import java.util.*;

public class FCP068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int s = sc.nextInt();

        int st = 0, sum = 0;
        boolean got = false;

        for (int end = 0; end < n; end++) {
            sum += arr[end];

            while (sum > s && st <= end) {
                sum -= arr[st];
                st++;
            }

            if (sum == s) {
                for (int i = st; i <= end; i++) {
                    System.out.println(arr[i]);
                }
                got = true;
                break;
            }
        }

        if (got == false) {
		}
    }
}
