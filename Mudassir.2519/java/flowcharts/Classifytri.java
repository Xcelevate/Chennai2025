import java.util.*;

public class Classifytri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int L = a, x = b, y = c;
        if (b >= a && b >= c) { 
			L = b; 
			x = a; 
			y = c; }
        else if (c >= a && c >= b) { 
			L = c; 
			x = a; 
			y = b; }

        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Invalid");
        } 
		else {
            int D = L*L - (x*x + y*y);
            if (D < 0) System.out.println("Acute");
            else if (D == 0) System.out.println("Right");
            else System.out.println("Obtuse");
        }
    }
}
