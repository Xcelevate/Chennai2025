import java.util.Scanner;

public class FCP020{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;
        int secondMax = Integer.MIN_VALUE;

        
        if (a != max && a > secondMax) secondMax = a;
        if (b != max && b > secondMax) secondMax = b;
        if (c != max && c > secondMax) secondMax = c;
        if (d != max && d > secondMax) secondMax = d;

       
        System.out.println(secondMax);
    }
}
