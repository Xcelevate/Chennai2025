import java.util.*;
public class secondmaxofthree{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int max=0;
		int secondmax=0;
		int t=0;
		
		if(a>b){ max=a; secondmax=b; }
		else{ max=b; secondmax=a; }
		
		int c=sc.nextInt();
		if(c>max){ t=max; max=c; secondmax=t; }
		else{ if(c>secondmax){ secondmax=c ; }}
		
		System.out.println(secondmax);
	}
}