import java.util.Scanner;
public class FCP015{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int max = 0;

		if(a>b){
			max = a;
		}
		else{
			max = b;
		}
		if(c>max){
			max=c;
		}
		if(d>max){
			max = d;
		}
		System.out.println(max);
	}
}