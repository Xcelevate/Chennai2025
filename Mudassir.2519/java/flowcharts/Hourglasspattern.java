import java.util.*;
public class Hourglasspattern{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m=0;
		int k =0;
		for(int i =1; i<=(2*n)-1; i++){
			if(i==1 || i==((2*n)-1)){
				System.out.print("* ".repeat(n));
			}
			else if(i>=1 && i<=(n-1)){
				System.out.print(" ".repeat(i-1));
				System.out.print("* ");
				System.out.print(" ".repeat(2*n-i-3-m));
				System.out.print("*");
			}
			else if(i==n){
				System.out.print(" ".repeat(i-1));
				System.out.print("* ");
			}
			else {
				System.out.print(" ".repeat((2*n-i)-1));
				System.out.print("* ");
				System.out.print(" ".repeat(i-n-1+k));
				System.out.print("*");
				k=k+1;
			}
			System.out.println();
			m= m+1;
		}
	}
}