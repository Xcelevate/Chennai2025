import java.util.Scanner;
public class FCP059 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();  
        int[] A = new int[N];
        int[] M = new int[N]; 
        int mIndex = 0;

        for (int i = 0; i < N; i++) {
            A[i] = scn.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    boolean found = false;
                    for (int k = 0; k < mIndex; k++) {
                        if (M[k] == A[i]) {
                           found= true;
                            break;
                        }
                    }
                    if (!found) {
                        M[mIndex] = A[i];
			mIndex++;
                    }
                    break;  
                }
            }
        }

        for (int i = 0; i < mIndex; i++) {
            System.out.println(M[i]);
        }
    }
}
import java.util.Scanner;
public class FCP059 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();  
        int[] A = new int[N];
        int[] M = new int[N]; 
        int mIndex = 0;

        for (int i = 0; i < N; i++) {
            A[i] = scn.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    boolean found = false;
                    for (int k = 0; k < mIndex; k++) {
                        if (M[k] == A[i]) {
                           found= true;
                            break;
                        }
                    }
                    if (!found) {
                        M[mIndex] = A[i];
			mIndex++;
                    }
                    break;  
                }
            }
        }

        for (int i = 0; i < mIndex; i++) {
            System.out.println(M[i]);
        }
    }
}
import java.util.Scanner;
public class FCP059 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();  
        int[] A = new int[N];
        int[] M = new int[N]; 
        int mIndex = 0;

        for (int i = 0; i < N; i++) {
            A[i] = scn.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    boolean found = false;
                    for (int k = 0; k < mIndex; k++) {
                        if (M[k] == A[i]) {
                           found= true;
                            break;
                        }
                    }
                    if (!found) {
                        M[mIndex] = A[i];
			mIndex++;
                    }
                    break;  
                }
            }
        }

        for (int i = 0; i < mIndex; i++) {
            System.out.println(M[i]);
        }
    }
}
import java.util.Scanner;
public class FCP059 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();  
        int[] A = new int[N];
        int[] M = new int[N]; 
        int mIndex = 0;

        for (int i = 0; i < N; i++) {
            A[i] = scn.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    boolean found = false;
                    for (int k = 0; k < mIndex; k++) {
                        if (M[k] == A[i]) {
                           found= true;
                            break;
                        }
                    }
                    if (!found) {
                        M[mIndex] = A[i];
			mIndex++;
                    }
                    break;  
                }
            }
        }

        for (int i = 0; i < mIndex; i++) {
            System.out.println(M[i]);
        }
    }
}
import java.util.Scanner;
public class FCP059 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();  
        int[] A = new int[N];
        int[] M = new int[N]; 
        int mIndex = 0;

        for (int i = 0; i < N; i++) {
            A[i] = scn.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (A[i] == A[j]) {
                    boolean found = false;
                    for (int k = 0; k < mIndex; k++) {
                        if (M[k] == A[i]) {
                           found= true;
                            break;
                        }
                    }
                    if (!found) {
                        M[mIndex] = A[i];
			mIndex++;
                    }
                    break;  
                }
            }
        }

        for (int i = 0; i < mIndex; i++) {
            System.out.println(M[i]);
        }
    }
}
