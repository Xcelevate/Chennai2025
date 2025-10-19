import java.util.*;
public class secondmaxoffour{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int max=0;
		int secondmax=0;
		int t=0;
	
		if(a>b){ max=a; secondmax=b;}
		else{ max=b; secondmax=a; }
		
		int c=sc.nextInt();
		if(c>max){ t=max;max=c;secondmax=t;}
		else{ if(c>secondmax){ secondmax=c;}} 
		
		int d=sc.nextInt();
		if(d>max){ t=max;max=d;secondmax=t;}
		else{ if(d>secondmax){ secondmax=d;}} 
		
		System.out.println(secondmax);
	}
}    
		
		
		