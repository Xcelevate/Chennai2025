import java.util.*;
public class subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int target = sc.nextInt();
        
        int start = 0, stop = 0;
        boolean flag = false;
        
        for (int i = 0; i < n; i++) {
            int a = arr[i];
         
            for (int j = i + 1; j < n; j++) {
                if (a == target) {
                    start = i;
                    stop = j;
                    flag = true;
                    break;
                }
                a += arr[j];
            }
            if (flag) break;
        }
        
        if (flag) {
            for (int i = start; i < stop; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
