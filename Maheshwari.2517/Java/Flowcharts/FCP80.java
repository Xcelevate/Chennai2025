import java.util.Scanner;

public class FCP80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        
        int num1 = 0, num2 = 0;
        for (int i = 0; i < n1; i++) {
            num1 = num1 * 10 + arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            num2 = num2 * 10 + arr2[i];
        }

       
        int product = num1 * num2;

        // Count digits in product
        int temp = product;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        
        int[] prodArr = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            prodArr[i] = product % 10;
            product /= 10;
        }

     
        for (int i = 0; i < count; i++) {
            System.out.print(prodArr[i]);
            if (i < count - 1) System.out.print(" ");
        }
    }
}
