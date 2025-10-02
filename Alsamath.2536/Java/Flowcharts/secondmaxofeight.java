import java.util.*;
public class secondmaxofeight{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int b=sc.nextInt();
		int max;
		int secondmax;
		int t=0;
		if(a>b){ max=a; secondmax=b;}
		else{max=b;secondmax=a;}
		
		int c=sc.nextInt();
		
		if(c>max){ t=max ; max=c; secondmax=t;}
		else{ if(c>secondmax) { secondmax=c;}}
		
		int d=sc.nextInt();
		
		if(d>max){ t=max ; max=d; secondmax=t;} 
		else{ if(d>secondmax) { secondmax=d;}}
		
		int e=sc.nextInt();
		
		if(e>max){ t=max ; max=e; secondmax=t;}
		else{ if(e>secondmax) { secondmax=e;}}
		
		int f=sc.nextInt();
		
		if(f>max){  t=max ; max=f; secondmax=t;}
		else{ if(f>secondmax) { secondmax=f;}}
		
		int g=sc.nextInt();
		
		if(g>max){ t=max ; max=g; secondmax=t;}
		else{ if(g>secondmax) { secondmax=g;}}
		
		int h=sc.nextInt();
		
		if(h>max){ t=max ; max=h; secondmax=t;}
		else{ if(h>secondmax) { secondmax=h;}}
	
		System.out.println(secondmax);
	}
}
		

		
			