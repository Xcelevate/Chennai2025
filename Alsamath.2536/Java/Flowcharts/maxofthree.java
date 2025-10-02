import java.util.*;
public class maxofthree{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int max=0;
		
		int t=0;
	
		if(a>b){ max=a; }
		else{ max=b; }
		
		int c=sc.nextInt();
		if(c>max){ max=c;}
				
		System.out.println(max);
	}
}    
		
		
		