import java.util.*;
public class secondmaxn{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int max=0;
		int second_max=0;
		
		if(a>b){ max=a; second_max=b; } 
		else{ max=b; second_max=a; }
		
		for(int i=3;i<=n;i++){
			int c= sc.nextInt();
			
			if(c>max){
				second_max=max;
				max=c;
			}
			else if(c>second_max){ 
				second_max=c;
			}
		}
		System.out.println(second_max);
	}
}
				