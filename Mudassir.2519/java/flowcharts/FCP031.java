import java.util.Scanner;
public class FCP031{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i =1;
		int rev =0;
		while(a>0){
			int r = a%10;
			rev =(rev*10)+r;
			a=a/10;
		}
		System.out.println(rev);
	}
}
			