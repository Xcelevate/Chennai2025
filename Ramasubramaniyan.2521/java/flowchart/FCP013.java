import java.util.Scanner;

public class FCP013 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a % 2 == 0) {
            System.out.println(a);
        } else {
            System.out.println(a * 2);
        }
    }
}