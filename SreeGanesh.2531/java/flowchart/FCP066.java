import java.util.Scanner;
public class FCP066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] A1 = new int[M];
        int[] A2 = new int[N];
		for (int i = 0; i < M; i++) {
            A1[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            A2[i] = sc.nextInt();
		}
      int i = 0; 
	  int j = 0;
        while (i < M && j < N) {
            if (A1[i] < A2[j]) {
               System.out.println(A1[i]);
			   i++;
            } else if(A1[i]>A2[j]){
				System.out.println(A2[j]);
				j++;
			}
             else{
                System.out.println(A1[i]);
				i++;
				j++;
            }
	while(i>0 && i<M && A1[i]==A1[i-1]) i++;
	while(j>0 && j<N && A2[j]==A2[j-1]) j++;
		}
        while (i < M) {
            System.out.println(A1[i]);
			i++;
			while(i>0 && i<M && A1[i]==A1[i-1]) i++;
        }

        while (j < N) {
            System.out.println(A2[j]);
			j++;
				while(j>0 && j<N && A2[j]==A2[j-1]) j++;
        }
		 i = 0; j = 0;

        while (i < M && j < N) {
            if (A1[i] < A2[j]) {
             i++;
            } else if(A1[i]>A2[j]){
				j++;
			}
             else{
                System.out.println(A1[i]);
				i++;
				j++;
		while(i>0 && i<M && A1[i]==A1[i-1]) i++;
	    while(j>0 && j<N && A2[j]==A2[j-1]) j++;
	}
}
	}
}
import java.util.Scanner;
public class FCP066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] A1 = new int[M];
        int[] A2 = new int[N];
		for (int i = 0; i < M; i++) {
            A1[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            A2[i] = sc.nextInt();
		}
      int i = 0; 
	  int j = 0;
        while (i < M && j < N) {
            if (A1[i] < A2[j]) {
               System.out.println(A1[i]);
			   i++;
            } else if(A1[i]>A2[j]){
				System.out.println(A2[j]);
				j++;
			}
             else{
                System.out.println(A1[i]);
				i++;
				j++;
            }
	while(i>0 && i<M && A1[i]==A1[i-1]) i++;
	while(j>0 && j<N && A2[j]==A2[j-1]) j++;
		}
        while (i < M) {
            System.out.println(A1[i]);
			i++;
			while(i>0 && i<M && A1[i]==A1[i-1]) i++;
        }

        while (j < N) {
            System.out.println(A2[j]);
			j++;
				while(j>0 && j<N && A2[j]==A2[j-1]) j++;
        }
		 i = 0; j = 0;

        while (i < M && j < N) {
            if (A1[i] < A2[j]) {
             i++;
            } else if(A1[i]>A2[j]){
				j++;
			}
             else{
                System.out.println(A1[i]);
				i++;
				j++;
		while(i>0 && i<M && A1[i]==A1[i-1]) i++;
	    while(j>0 && j<N && A2[j]==A2[j-1]) j++;
	}
}
	}
}
import java.util.Scanner;
public class FCP066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] A1 = new int[M];
        int[] A2 = new int[N];
		for (int i = 0; i < M; i++) {
            A1[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            A2[i] = sc.nextInt();
		}
      int i = 0; 
	  int j = 0;
        while (i < M && j < N) {
            if (A1[i] < A2[j]) {
               System.out.println(A1[i]);
			   i++;
            } else if(A1[i]>A2[j]){
				System.out.println(A2[j]);
				j++;
			}
             else{
                System.out.println(A1[i]);
				i++;
				j++;
            }
	while(i>0 && i<M && A1[i]==A1[i-1]) i++;
	while(j>0 && j<N && A2[j]==A2[j-1]) j++;
		}
        while (i < M) {
            System.out.println(A1[i]);
			i++;
			while(i>0 && i<M && A1[i]==A1[i-1]) i++;
        }

        while (j < N) {
            System.out.println(A2[j]);
			j++;
				while(j>0 && j<N && A2[j]==A2[j-1]) j++;
        }
		 i = 0; j = 0;

        while (i < M && j < N) {
            if (A1[i] < A2[j]) {
             i++;
            } else if(A1[i]>A2[j]){
				j++;
			}
             else{
                System.out.println(A1[i]);
				i++;
				j++;
		while(i>0 && i<M && A1[i]==A1[i-1]) i++;
	    while(j>0 && j<N && A2[j]==A2[j-1]) j++;
	}
}
	}
}
import java.util.Scanner;
public class FCP066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] A1 = new int[M];
        int[] A2 = new int[N];
		for (int i = 0; i < M; i++) {
            A1[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            A2[i] = sc.nextInt();
		}
      int i = 0; 
	  int j = 0;
        while (i < M && j < N) {
            if (A1[i] < A2[j]) {
               System.out.println(A1[i]);
			   i++;
            } else if(A1[i]>A2[j]){
				System.out.println(A2[j]);
				j++;
			}
             else{
                System.out.println(A1[i]);
				i++;
				j++;
            }
	while(i>0 && i<M && A1[i]==A1[i-1]) i++;
	while(j>0 && j<N && A2[j]==A2[j-1]) j++;
		}
        while (i < M) {
            System.out.println(A1[i]);
			i++;
			while(i>0 && i<M && A1[i]==A1[i-1]) i++;
        }

        while (j < N) {
            System.out.println(A2[j]);
			j++;
				while(j>0 && j<N && A2[j]==A2[j-1]) j++;
        }
		 i = 0; j = 0;

        while (i < M && j < N) {
            if (A1[i] < A2[j]) {
             i++;
            } else if(A1[i]>A2[j]){
				j++;
			}
             else{
                System.out.println(A1[i]);
				i++;
				j++;
		while(i>0 && i<M && A1[i]==A1[i-1]) i++;
	    while(j>0 && j<N && A2[j]==A2[j-1]) j++;
	}
}
	}
}
import java.util.Scanner;
public class FCP066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[] A1 = new int[M];
        int[] A2 = new int[N];
		for (int i = 0; i < M; i++) {
            A1[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            A2[i] = sc.nextInt();
		}
      int i = 0; 
	  int j = 0;
        while (i < M && j < N) {
            if (A1[i] < A2[j]) {
               System.out.println(A1[i]);
			   i++;
            } else if(A1[i]>A2[j]){
				System.out.println(A2[j]);
				j++;
			}
             else{
                System.out.println(A1[i]);
				i++;
				j++;
            }
	while(i>0 && i<M && A1[i]==A1[i-1]) i++;
	while(j>0 && j<N && A2[j]==A2[j-1]) j++;
		}
        while (i < M) {
            System.out.println(A1[i]);
			i++;
			while(i>0 && i<M && A1[i]==A1[i-1]) i++;
        }

        while (j < N) {
            System.out.println(A2[j]);
			j++;
				while(j>0 && j<N && A2[j]==A2[j-1]) j++;
        }
		 i = 0; j = 0;

        while (i < M && j < N) {
            if (A1[i] < A2[j]) {
             i++;
            } else if(A1[i]>A2[j]){
				j++;
			}
             else{
                System.out.println(A1[i]);
				i++;
				j++;
		while(i>0 && i<M && A1[i]==A1[i-1]) i++;
	    while(j>0 && j<N && A2[j]==A2[j-1]) j++;
	}
}
	}
}
