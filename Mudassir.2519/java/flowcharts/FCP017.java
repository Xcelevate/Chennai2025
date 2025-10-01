import java.util.Scanner;
public class FCP017{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = 0;
		int smax =0;

		if (a>b){
			max=a;
			smax=b;
		}
		else{
			max=b;
			smax=a;
		}
		if(c>max){
			smax = max;
			max =c;
		}
		else{
			if(c>smax){
				smax = c;
			}
		}
		System.out.println(smax);
	}
}
