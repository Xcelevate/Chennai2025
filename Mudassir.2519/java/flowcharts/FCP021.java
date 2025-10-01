import java.util.Scanner;
public class FCP021{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		int g = sc.nextInt();
		int h = sc.nextInt();
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
		if(e>max){
			smax = max;
			max =e;
		}
		else{
			if(e>smax){
				smax = e;
			}
		}
		if(f>max){
			smax = max;
			max =f;
		}
		else{
			if(f>smax){
				smax = f;
			}
		}
		if(g>max){
			smax = max;
			max =g;
		}
		else{
			if(g>smax){
				smax = g;
			}
		}
		if(h>max){
			smax = max;
			max =h;
		}
		else{
			if(h>smax){
				smax = h;
			}
		}
		System.out.println(smax);
	}
}
