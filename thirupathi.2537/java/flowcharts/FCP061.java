import java.util.Scanner;
public class FCP061 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int array[] = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        boolean visited[] = new boolean[N];
        for (int j = 0; j < N; j++) {
            if (visited[j]) continue;
            int count = 1;
            for (int k = j + 1; k < N; k++) {
                if (array[k] == array[j]) {
                    visited[k] = true;
                    count++;
                }
            }
            System.out.println(array[j] + " - " + count);
        }
    }
}
