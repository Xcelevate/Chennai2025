import java.util.Scanner;

public class FCP022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        printFrequency(a, b, c, d, e);
    }
    public static void printFrequency(int a, int b, int c, int d, int e) {
        int countA = 0;
        if (a == a) countA++;
        if (b == a) countA++;
        if (c == a) countA++;
        if (d == a) countA++;
        if (e == a) countA++;
        System.out.println(a + " = " + countA);
        if (!(b == a)) {
            int countB = 0;
            if (a == b) countB++;
            if (b == b) countB++;
            if (c == b) countB++;
            if (d == b) countB++;
            if (e == b) countB++;
            System.out.println(b + " = " + countB);
        }
        if (!(c == a) && !(c == b)) {
            int countC = 0;
            if (a == c) countC++;
            if (b == c) countC++;
            if (c == c) countC++;
            if (d == c) countC++;
            if (e == c) countC++;
            System.out.println(c + " = " + countC);
        }
        if (!(d == a) && !(d == b) && !(d == c)) {
            int countD = 0;
            if (a == d) countD++;
            if (b == d) countD++;
            if (c == d) countD++;
            if (d == d) countD++;
            if (e == d) countD++;
            System.out.println(d + " = " + countD);
        }
        if (!(e == a) && !(e == b) && !(e == c) && !(e == d)) {
            int countE = 0;
            if (a == e) countE++;
            if (b == e) countE++;
            if (c == e) countE++;
            if (d == e) countE++;
            if (e == e) countE++;
            System.out.println(e + " = " + countE);
        }
    }
}
