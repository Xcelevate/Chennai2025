//Left aligned right angle star pattern
import java.util.Scanner;
public class FCP081 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
             for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
             for(int k=1;k<=i;k++){
                System.out.print("* ");
             }
           
            System.out.println();
        }
    //     for (int a = 0; a < n; a++) {
    //         for ( int b = 2 * (n - a); b > 0; b--) {
    //             System.out.print(" ");
    //         }
    //         for (int b= 0; b <= a; b++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    // }
}
}
