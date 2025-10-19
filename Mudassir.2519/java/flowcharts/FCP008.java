import java.util.Scanner;
public class FCP008{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		

		b= b-a;
		a= a+b;
		b = a-b;
		
		System.out.println(a);
		System.out.println(b);
	}
}