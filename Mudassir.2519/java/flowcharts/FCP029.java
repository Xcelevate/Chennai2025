import java.util.Scanner;
public class FCP029{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		
		while(a>0){
			int r = a%10;
			sum = sum+r;
			a= a/10;
		}
		System.out.println(sum);
	}
}