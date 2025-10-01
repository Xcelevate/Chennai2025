import java.util.Scanner;

public class Hollowsquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		
		for(int i =1; i<=n; i++){
			if(i ==1 || i==n){
				System.out.println("* ".repeat(n));
			}
			else{
				System.out.print("* ");
				System.out.print("  ".repeat(n-2));
				System.out.println("*");
			} 
		}
	}
} 