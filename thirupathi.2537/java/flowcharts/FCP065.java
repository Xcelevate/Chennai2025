import java.util.Scanner;
public class FCP065 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int arr1[] = new int[M];
        int arr2[] = new int[N];
        for (int i = 0; i < M; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int j = 0; j < N; j++) {
            arr2[j] = sc.nextInt();
        }
        int C = M + N;
        int arr3[] = new int[C];
        int i = 0, j = 0, k = 0;
        while (i < M && j < N) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < M) {
            arr3[k++] = arr1[i++];
        }
        while (j < N) {
            arr3[k++] = arr2[j++];
        }
        if (C % 2 == 1) {
            System.out.printf("%.1f\n", (double) arr3[C / 2]);
        } else {
            System.out.printf("%.1f\n", ((double) arr3[(C / 2) - 1] + arr3[C / 2]) / 2.0);
        }
    }
}

 
       