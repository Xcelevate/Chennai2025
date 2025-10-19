import java.util.Scanner;
public class Fcp068 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c[] = new int[b];
        for (int d = 0; d < b; d++) {
            c[d] = a.nextInt();
        }
        int e = a.nextInt();
        int f = 0;
        for (int g = 0; g < b; g++) {
            int h = c[g];
            for (int i = g + 1; i < b + 1; i++) {
                if (h <= e) {
                    if (h == e) {
                        while (g < i) {
                            System.out.println(c[g++]);
                            f = 1;
                        }
                        return;
                    } else if (g == b - 1 && (c[g] > e || c[g] < e)) {
                        System.out.println("nothing");
                        f = 1;
                    } else {
                        h += c[i];
                    }
                } else {
                    break;
                }
            }
        }
        if (f == 0) {
            System.out.println("nothing");
        }
    }
}
