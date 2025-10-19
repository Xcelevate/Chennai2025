import java.util.*;
public class arithmeticop{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		long a = sc.nextInt();
		long b = sc.nextInt();
		int max=0;
		int min=0;
		long sum=0;
		long sub=0;
		long mul=0;
		double div=0;
		long int_div=0;
		long mod=0;
		
		
		
		
		sum=a+b;
		sub=a-b;
		mul=a*b;
		div=(double)a/b;
		int_div=a/b;
		mod=a%b;
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(int_div);
		System.out.println(mod);
	}
	
}
		