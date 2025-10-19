import java.util.*;
public class FCP087 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        for (int c=1;c<=b;c++) {
            for (int d = 1; d <= c; d++) {
                System.out.print("*");
            }
            for (int e= b-c;e>=1;e--) {
                System.out.print(" ");
            }
            for (int f= b-c;f>=1;f--) {
                System.out.print(" ");
            }
            for (int g=1;g<=c;g++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int h=b-1;h>=1;h--) {
            for (int i=1;i<=h;i++) {
                System.out.print("*");
            }
            for (int j=b-h;j>=1;j--) {
                System.out.print(" ");
            }
            for (int k=b-h;k>=1;k--) {
                System.out.print(" ");
            }
            for (int l=1;l<=h;l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
