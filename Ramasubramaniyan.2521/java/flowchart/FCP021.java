import java.util.Scanner;

public class FCP021 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();
        int e = s.nextInt();
        int f = s.nextInt();
        int g = s.nextInt();
        int h = s.nextInt();

        int max = a;
        int second = b;

        if (b > a) {
            max = b;
            second = a;
        }

        // Check c
        if (c > max) {
            second = max;
            max = c;
        } else {
            if (c > second) {
                second = c;
            }
        }

        // Check d
        if (d > max) {
            second = max;
            max = d;
        } else {
            if (d > second) {
                second = d;
            }
        }

        // Check e
        if (e > max) {
            second = max;
            max = e;
        } else {
            if (e > second) {
                second = e;
            }
        }

        // Check f
        if (f > max) {
            second = max;
            max = f;
        } else {
            if (f > second) {
                second = f;
            }
        }

        // Check g
        if (g > max) {
            second = max;
            max = g;
        } else {
            if (g > second) {
                second = g;
            }
        }

        // Check h
        if (h > max) {
            second = max;
            max = h;
        } else {
            if (h > second) {
                second = h;
            }
        }

        System.out.println(second);
    }
}
