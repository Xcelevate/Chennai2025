import java.util.*;

public class secondsmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int min1, min2;

        
        if (a < b) { min1 = a; min2 = b; }
        else       { min1 = b; min2 = a; }

        
        if (c < min1) { min2 = min1; min1 = c; }
        else if (c < min2) { min2 = c; }

        
        if (d < min1) { min2 = min1; min1 = d; }
        else if (d < min2) { min2 = d; }

        System.out.println(min2);
    }
}
