import java.util.*;
public class hollowdiamond2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int x=n-1;
		int a=1;
	
		
		for(int i=1;i<=n;i++){
			
			for(int j=1;j<=x;j++){
				System.out.print(" ");
			}
		
			for(int k=1;k<=a;k++){
				if(k==1 || k==a){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			x=x-1;
			a=a+2;
			System.out.println();
		}
		
		x=1;
		a=a-4;
		for(int i=n+1;i<=(2*n)-1;i++){
			
			for(int j=1;j<=x;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=a;k++){
				if(k==1 || k==a){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
					}
				
			}
			x=x+1;
			a=a-2;
			System.out.println();
		}
	}
}