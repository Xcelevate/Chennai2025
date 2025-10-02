import java.util.*;
public class thirdmaxuser{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int thirdmax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a > max) {
                thirdmax = secondmax;
                secondmax = max;
                max = a;
            } else if (a > secondmax && a < max) {
                thirdmax = secondmax;
                secondmax = a;
            } else if (a > thirdmax && a < secondmax) {
                thirdmax = a;
            }
        }
        System.out.println("Third maximum: " + thirdmax);
    }
}