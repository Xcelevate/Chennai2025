import java.util.Scanner;
public class FCP033{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int temp =a;
		int rev=0;

		while(a>0){
			int r=a%10;
			rev = (rev*10)+r;
			a=a/10;
		}
		if (temp == rev){
			System.out.print("Yes");
		}
		else{
			System.out.print("No");
		}
	}
}
