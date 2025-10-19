import java.util.Scanner;

public class FCP066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(); 
        int n = sc.nextInt(); 

        int[] arr1 = new int[m];
        int[] arr2 = new int[n];

        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                System.out.println(arr1[i]);
                i++;
            } else if (arr2[j] < arr1[i]) {
                System.out.println(arr2[j]);
                j++;
            } else {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        while (i > 0 && i < m && arr1[i] == arr1[i - 1]) i++;
        while (j > 0 && j < n && arr2[j] == arr2[j - 1]) j++;
        }
        while (i < m) {
            System.out.println(arr1[i]);
            i++;
        }
        while (j < n) {
            System.out.println(arr2[j]);
            j++;
        }
        
        i = 0;
        j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
            while (i > 0 && i < m && arr1[i] == arr1[i - 1]) i++;
            while (j > 0 && j < n && arr2[j] == arr2[j - 1]) j++;
        }
    }
}
