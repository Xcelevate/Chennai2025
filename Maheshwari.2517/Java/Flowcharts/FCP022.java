import java.util.Scanner;

public class FCP022{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        boolean[] visited = new boolean[5];

        
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        
        for (int i = 0; i < 5; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < 5; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(arr[i] + " = " + count);
            }
        }
    }
}
