import java.util.Scanner;
public class FCP020{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
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
		if(d>max){
			smax = max;
			max =d;
		}
		else{
			if(d>smax){
				smax = d;
			}
		}
		System.out.println(smax);
	}
}
