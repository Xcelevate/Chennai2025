import java.util.Scanner;

public class FCP059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] printed = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            if (printed[i]) {
                continue;
            }
            
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    for (int k = j; k < n; k++) {
                        if (arr[i] == arr[k]) {
                            printed[k] = true;
                        }
                    }
                    break;
                }
            }
            
            if (isDuplicate) {
                System.out.println(arr[i]);
            }
        }
    }
}