import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int original = n;
        int sum = 0;
        if(n==0){
			sum=factorial(0);
		}
		else{
        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
		}
        if (sum == original) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

  
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int original = n;
        int sum = 0;
        if(n==0){
			sum=factorial(0);
		}
		else{
        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
		}
        if (sum == original) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

  
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int original = n;
        int sum = 0;
        if(n==0){
			sum=factorial(0);
		}
		else{
        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
		}
        if (sum == original) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

  
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int original = n;
        int sum = 0;
        if(n==0){
			sum=factorial(0);
		}
		else{
        while (n > 0) {
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
		}
        if (sum == original) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

  
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
