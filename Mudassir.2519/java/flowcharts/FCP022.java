import java.util.Scanner;
public class FCP022 {
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	long a = sc.nextLong();
        	long b = sc.nextLong();
        	long c = sc.nextLong();
        	long d = sc.nextLong();
        	long e = sc.nextLong();

        	int countA = 1;
			int countB = 1;
			int countC = 1;
			int countD = 1;
			int countE = 1;

        	if (a == b) countA++;
        	if (a == c) countA++;
        	if (a == d) countA++;
        	if (a == e) countA++;

        	System.out.println(a + " = " + countA);

        	if (b != a) {
           		if (b == c) countB++;
            	if (b == d) countB++;
            	if (b == e) countB++;
            	System.out.println(b + " = " + countB);
       		}

        	if (c != a && c != b) {
            	if (c == d) countC++;
            	if (c == e) countC++;
            	System.out.println(c + " = " + countC);
        	}

        	if (d != a && d != b && d != c) {
            	if (d == e) countD++;
            	System.out.println(d + " = " + countD);
        	}

        	if (e != a && e != b && e != c && e != d) {
            	System.out.println(e + " = " + countE);
        	}
    	}
}
