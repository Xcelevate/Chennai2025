import java.util.*;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 1 || n > 100) {
            return;
        }
        int[] arr = new int[n];
        boolean[] x= new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (!x[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                       x[j] = true; 
                    }
                }
                System.out.println(arr[i] + " - " + count);
               x[i] = true;
            }
        }
    }
}
