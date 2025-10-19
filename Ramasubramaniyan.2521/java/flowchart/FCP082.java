
//Inverted Right Triangle star night
import java.util.Scanner;

public class FCP082 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = a; j > i; j--) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}