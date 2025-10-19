import java.util.Scanner;

public class ClassifyTheTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            if (b > a) {
                int temp = a;
                a = b;
                b = temp;
            }
            if (c > a) {
                int temp = a;
                a = c;
                c = temp;
            }
            int d = a * a - (b * b + c * c);
            if (d > 0) {
                System.out.println("Obtuse");
            } else if (d == 0) {
                System.out.println("Right");
            } else {
                System.out.println("Acute");
            }

        } else {
            System.out.println("Invalid");
        }
    }
}
