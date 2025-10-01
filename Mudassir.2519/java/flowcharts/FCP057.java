import java.util.Scanner;
public class FCP057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  
        int M = sc.nextInt();  
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
	int m = M - 1;
        for (int j = m; j < N - 1; j++) {
            A[j] = A[j + 1];
        }
		 for (int i = 0; i < N - 1; i++){
       System.out.println(A[i]);
        }
    }

}