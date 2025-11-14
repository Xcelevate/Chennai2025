import java.util.Scanner;

public class FCP064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[M];
        int[] B = new int[N];

        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        int[] l = new int[M + N];
        int i = 0, j = 0, k = 0;

        while (i < M && j < N) {
            if (A[i] < B[j]) {
                l[k++] = A[i++];
            } else {
                l[k++] = B[j++];
            }
        }
        while (i < M) {
            l[k++] = A[i++];
        }

        while (j < N) {
            l[k++] = B[j++];
        }
        for (int x = 0; x < M + N; x++) {
            System.out.println(l[x] + " ");
        }
    }
}
import java.util.Scanner;

public class FCP064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[M];
        int[] B = new int[N];

        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        int[] l = new int[M + N];
        int i = 0, j = 0, k = 0;

        while (i < M && j < N) {
            if (A[i] < B[j]) {
                l[k++] = A[i++];
            } else {
                l[k++] = B[j++];
            }
        }
        while (i < M) {
            l[k++] = A[i++];
        }

        while (j < N) {
            l[k++] = B[j++];
        }
        for (int x = 0; x < M + N; x++) {
            System.out.println(l[x] + " ");
        }
    }
}
import java.util.Scanner;

public class FCP064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[M];
        int[] B = new int[N];

        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        int[] l = new int[M + N];
        int i = 0, j = 0, k = 0;

        while (i < M && j < N) {
            if (A[i] < B[j]) {
                l[k++] = A[i++];
            } else {
                l[k++] = B[j++];
            }
        }
        while (i < M) {
            l[k++] = A[i++];
        }

        while (j < N) {
            l[k++] = B[j++];
        }
        for (int x = 0; x < M + N; x++) {
            System.out.println(l[x] + " ");
        }
    }
}
import java.util.Scanner;

public class FCP064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[M];
        int[] B = new int[N];

        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        int[] l = new int[M + N];
        int i = 0, j = 0, k = 0;

        while (i < M && j < N) {
            if (A[i] < B[j]) {
                l[k++] = A[i++];
            } else {
                l[k++] = B[j++];
            }
        }
        while (i < M) {
            l[k++] = A[i++];
        }

        while (j < N) {
            l[k++] = B[j++];
        }
        for (int x = 0; x < M + N; x++) {
            System.out.println(l[x] + " ");
        }
    }
}
import java.util.Scanner;

public class FCP064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] A = new int[M];
        int[] B = new int[N];

        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        int[] l = new int[M + N];
        int i = 0, j = 0, k = 0;

        while (i < M && j < N) {
            if (A[i] < B[j]) {
                l[k++] = A[i++];
            } else {
                l[k++] = B[j++];
            }
        }
        while (i < M) {
            l[k++] = A[i++];
        }

        while (j < N) {
            l[k++] = B[j++];
        }
        for (int x = 0; x < M + N; x++) {
            System.out.println(l[x] + " ");
        }
    }
}
