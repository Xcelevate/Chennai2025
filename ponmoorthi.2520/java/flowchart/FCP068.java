import java.util.Scanner;
public class FCP068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int p = 0; p < n; p++)
	 {
            arr[p] = sc.nextInt();
        }
        int target= sc.nextInt();
        int flag=0;
        for (int i=0;i<n;i++) {
            int sum = arr[i];
            for (int j = i + 1; j < n + 1; j++) {
                if (sum <= target) {
                    if (sum == target) {
                        while (i < j) {
                            System.out.println(arr[i++]);
                            flag = 1;
                        }
                        return;
                    } else if (i==n-1 && (arr[i]>target ||arr[i]<target)) {
                        System.out.println("nothing");
                        flag = 1;
                    } else {
                        sum += arr[j];
                    }
                } else {
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println("nothing");
        }
    }
}
