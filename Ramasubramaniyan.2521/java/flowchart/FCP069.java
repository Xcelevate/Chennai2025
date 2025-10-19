import java.util.Scanner;

public class FCP069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int size = n;
        int index = 0;
        while (size > 0) {
            index = (index + k - 1) % size;
            System.out.println(arr[index]);
            for (int j = index; j < size - 1; j++) {
                arr[j] = arr[j + 1];
            }
            size--;
        }

    }
}
