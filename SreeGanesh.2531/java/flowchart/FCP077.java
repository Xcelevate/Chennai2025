import java.util.Scanner;
public class FCP077 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0 || n < 1 || n > 20) {
                       return;
        }
        int[][] magic = new int[n][n];
        int num = 1;
        int i = 0;        
        int j = n / 2;    

        while (num <= n * n) {
            magic[i][j] = num;
            int newi = (i - 1 + n) % n;
            int newj = (j + 1) % n;

            if (magic[newi][newj] != 0) { 
                
                i = (i + 1) % n;
            } else {
                i = newi;
                j = newj;
            }

            num++;
        }
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.println(magic[r][c]);
            }
        }
    }
}import java.util.Scanner;
public class FCP077 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0 || n < 1 || n > 20) {
                       return;
        }
        int[][] magic = new int[n][n];
        int num = 1;
        int i = 0;        
        int j = n / 2;    

        while (num <= n * n) {
            magic[i][j] = num;
            int newi = (i - 1 + n) % n;
            int newj = (j + 1) % n;

            if (magic[newi][newj] != 0) { 
                
                i = (i + 1) % n;
            } else {
                i = newi;
                j = newj;
            }

            num++;
        }
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.println(magic[r][c]);
            }
        }
    }
}import java.util.Scanner;
public class FCP077 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0 || n < 1 || n > 20) {
                       return;
        }
        int[][] magic = new int[n][n];
        int num = 1;
        int i = 0;        
        int j = n / 2;    

        while (num <= n * n) {
            magic[i][j] = num;
            int newi = (i - 1 + n) % n;
            int newj = (j + 1) % n;

            if (magic[newi][newj] != 0) { 
                
                i = (i + 1) % n;
            } else {
                i = newi;
                j = newj;
            }

            num++;
        }
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.println(magic[r][c]);
            }
        }
    }
}import java.util.Scanner;
public class FCP077 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0 || n < 1 || n > 20) {
                       return;
        }
        int[][] magic = new int[n][n];
        int num = 1;
        int i = 0;        
        int j = n / 2;    

        while (num <= n * n) {
            magic[i][j] = num;
            int newi = (i - 1 + n) % n;
            int newj = (j + 1) % n;

            if (magic[newi][newj] != 0) { 
                
                i = (i + 1) % n;
            } else {
                i = newi;
                j = newj;
            }

            num++;
        }
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.println(magic[r][c]);
            }
        }
    }
}import java.util.Scanner;
public class FCP077 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0 || n < 1 || n > 20) {
                       return;
        }
        int[][] magic = new int[n][n];
        int num = 1;
        int i = 0;        
        int j = n / 2;    

        while (num <= n * n) {
            magic[i][j] = num;
            int newi = (i - 1 + n) % n;
            int newj = (j + 1) % n;

            if (magic[newi][newj] != 0) { 
                
                i = (i + 1) % n;
            } else {
                i = newi;
                j = newj;
            }

            num++;
        }
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.println(magic[r][c]);
            }
        }
    }
}