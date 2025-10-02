import java.util.Scanner;
public class FCP094 
   {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
        	int a = sc.nextInt();
        	for (int m = a; m > 0; m--) {
      	    	for (int c = 1; c <= a - m; c++) {
               		 System.out.print(" ");
         		   }
        	    System.out.print("* ");
           	 for (int d = 1; d < m; d++) {
            	    if (m == a || d == m - 1) {
            	        System.out.print("* ");
             	   } else {
            	        System.out.print("  ");
            	    }
           	 }
           	 System.out.println();
        	}
        for (int m = 2; m <= a; m++) {
            for (int c = a - m; c > 0; c--) {
                System.out.print(" ");
            }
            System.out.print("* ");
            for (int d = 1; d < m; d++) {
                if (m == a || d == m - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
          System.out.println();
   }
   }
}
