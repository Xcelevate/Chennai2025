import java.util.Scanner;
public class FCP038{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp = a;
		int sum=0;

		while(a>0){
			int r =a%10;
			sum =sum+(r*r*r);
			a=a/10;
		}
		if(temp==sum){
			System.out.print("Yes");
		}
		else{
			System.out.print("No");
		}
	}
}