import java.util.*;

public class duplicatesinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n > 100 || n < 1) return;

        int[] arr = new int[n];
		int[] arr1= new int[n];
        boolean found = false;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean duplicateFound = false;
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) 
				continue;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    duplicateFound = true;
                    break;
                }
            }

            if (duplicateFound) {
               for(int k=0;i<n;i++){
					arr1[k]=arr[i];
					System.out.println(arr1[k]);
			   }
                found = true;
            }
        }

        if (!found) {
            return;
        }
    }
}
