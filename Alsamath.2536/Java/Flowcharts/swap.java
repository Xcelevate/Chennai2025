import java.util.*;
public class swap {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(a<1 &&b>1 && a>1000000 && b>1000000){
			return;
		}
		
		int t=0;
		t=a;
		a=b;
		b=t;
		System.out.println(a);
		System.out.println(b);
	}
}
		
		