import java.util.Scanner;
public class FCP071 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < array[i]; j++) {
                System.out.print(">");
            }
            System.out.println();
        }
    }
}
