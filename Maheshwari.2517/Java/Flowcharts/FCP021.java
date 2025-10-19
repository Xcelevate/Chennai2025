import java.util.Scanner;

public class FCP021{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();
        int F = scanner.nextInt();
        int G = scanner.nextInt();
        int H = scanner.nextInt();

    int max,secondMax;
if(A>B){
max=A;
secondMax =B;
}
else {
 max=B;
secondMax=A;
}

if (C > max) {
            secondMax = max;
            max = C;
        } else if (C > secondMax) {
            secondMax = C;
        }


if (D > max) {
            secondMax = max;
            max = D;
        } else if (D > secondMax) {
            secondMax = D;
        }


if (E > max) {
            secondMax = max;
            max = E;
        } else if (E > secondMax) {
            secondMax = E;
        }


if (F > max) {
            secondMax = max;
            max = F;
        } else if (F > secondMax) {
            secondMax = F;
        }

if (G > max) {
            secondMax = max;
            max = G;
        } else if (G > secondMax) {
            secondMax = G;
        }

if (H > max) {
            secondMax = max;
            max = H;
        } else if (H > secondMax) {
            secondMax = H;
        }
System.out.print(secondMax);

}
}
