import java.util.*;
public class palindromicpattern{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		int a=1;
		int b=n-1;
		for(int i=1;i<=n;i++){
			int d=n+1;
			for(int j=1;j<=b;j++){
				System.out.print(" ");
			} 
			b-=1;
			for(int j=1;j<=a;j++){
				if(j<=i){
					d=d-1;
					System.out.print(d);
					
				}
				else{
					d=d+1;
					System.out.print(d);
				}
				
			}
			a=a+2;
			System.out.println();
		} 
		a=a-4;
		b=1;
		int c=n-1;
		for(int i=n+1;i<=(2*n)+1;i++){
			int d=n+1;
			for(int j=1;j<=b;j++){
				System.out.print(" ");
			}
			b+=1;
			for(int j=1;j<=a;j++){
				if(j<=c){
					d=d-1;
					System.out.print(d);
					
				}
				else{
					d=d+1;
					System.out.print(d);
				}
				
			}
			a=a-2;
			c=c-1;
			System.out.println();
		}
	}
}
			