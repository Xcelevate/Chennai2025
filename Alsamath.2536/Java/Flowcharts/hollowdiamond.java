import java.util.*;
public class hollowdiamond{
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
				System.out.print("*");
			}
			x=x-1;
			a=a+2;
			System.out.println();
		}
	
		int z=n+1;
		x=1;
		a=a-4;
		for(int i=z;i<=(2*n)-1;i++){
			
			for(int j=1;j<=x;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=a;k++){
				System.out.print("*");
			}
			x=x+1;
			a=a-2;
			System.out.println();
		}
	}
}