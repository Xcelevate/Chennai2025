import java.util.*;
public class FCP061 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] got = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (got[i]) continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    got[j] = true;
                }
            }
            System.out.println(arr[i] + " - " + count);
        }
    }
}
