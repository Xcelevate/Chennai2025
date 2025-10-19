package DomJudge;

import java.util.Scanner;

public class FCP070 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        int array []  = new int[n];
        for (int i = 0 ; i < n ; i++){
            array[i] = scanner.nextInt();
        }
        int a = scanner.nextInt();

        int start = 0 ,end = n - 1;
        while(start <= end ) {
            int mid = start + (end - start) / 2;
            if (array[mid] == a) {
                System.out.println("Yes");
                return;
            } else if (array[mid] < a) {
                start = mid + 1;
            } else {
                end = mid - 1;

            }

        }
        System.out.println("No");
    }


}


