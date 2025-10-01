import java.util.Scanner;
public class FCP009{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a%b;
		a= a-c;
		System.out.println(a);
	}
}
			
