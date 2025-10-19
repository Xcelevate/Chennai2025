import java.util.Scanner;
public class FCP003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }
}
