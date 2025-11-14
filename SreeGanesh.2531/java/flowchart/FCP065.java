import java.util.Scanner;
public class Greater {
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
		int[] x = new int[M + N];
        int i = 0, j = 0, k = 0;

        while (i < M && j < N) {
            if (A[i] < B[j]) {
                x[k++] = A[i++];
            } else {
                x[k++] = B[j++];
            }
        }
        while (i < M) {
            x[k++] = A[i++];
        }

        while (j < N) {
            x[k++] = B[j++];
        }
		int t=M+N;
		double m;
		if(t%2==1){
		m=x[t/2];
		}
		else{
		m=(x[t/2-1]+x[t/2])/2.0;
		}
		System.out.println(m);
		}
		}import java.util.Scanner;
public class Greater {
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
		int[] x = new int[M + N];
        int i = 0, j = 0, k = 0;

        while (i < M && j < N) {
            if (A[i] < B[j]) {
                x[k++] = A[i++];
            } else {
                x[k++] = B[j++];
            }
        }
        while (i < M) {
            x[k++] = A[i++];
        }

        while (j < N) {
            x[k++] = B[j++];
        }
		int t=M+N;
		double m;
		if(t%2==1){
		m=x[t/2];
		}
		else{
		m=(x[t/2-1]+x[t/2])/2.0;
		}
		System.out.println(m);
		}
		}import java.util.Scanner;
public class Greater {
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
		int[] x = new int[M + N];
        int i = 0, j = 0, k = 0;

        while (i < M && j < N) {
            if (A[i] < B[j]) {
                x[k++] = A[i++];
            } else {
                x[k++] = B[j++];
            }
        }
        while (i < M) {
            x[k++] = A[i++];
        }

        while (j < N) {
            x[k++] = B[j++];
        }
		int t=M+N;
		double m;
		if(t%2==1){
		m=x[t/2];
		}
		else{
		m=(x[t/2-1]+x[t/2])/2.0;
		}
		System.out.println(m);
		}
		}import java.util.Scanner;
public class Greater {
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
		int[] x = new int[M + N];
        int i = 0, j = 0, k = 0;

        while (i < M && j < N) {
            if (A[i] < B[j]) {
                x[k++] = A[i++];
            } else {
                x[k++] = B[j++];
            }
        }
        while (i < M) {
            x[k++] = A[i++];
        }

        while (j < N) {
            x[k++] = B[j++];
        }
		int t=M+N;
		double m;
		if(t%2==1){
		m=x[t/2];
		}
		else{
		m=(x[t/2-1]+x[t/2])/2.0;
		}
		System.out.println(m);
		}
		}import java.util.Scanner;
public class Greater {
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
		int[] x = new int[M + N];
        int i = 0, j = 0, k = 0;

        while (i < M && j < N) {
            if (A[i] < B[j]) {
                x[k++] = A[i++];
            } else {
                x[k++] = B[j++];
            }
        }
        while (i < M) {
            x[k++] = A[i++];
        }

        while (j < N) {
            x[k++] = B[j++];
        }
		int t=M+N;
		double m;
		if(t%2==1){
		m=x[t/2];
		}
		else{
		m=(x[t/2-1]+x[t/2])/2.0;
		}
		System.out.println(m);
		}
		}