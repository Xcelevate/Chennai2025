import java.util.*;
public class PowerDoubleTriangle{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		int r=2;
		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				if(i==1 && j==1){
					System.out.print(0);
				}
				else if(j==1){
					System.out.print(r+" ");
					r=r*2;
				}
				else{
					
					System.out.print(r+" ");
				}
			}
			System.out.println();
			
			
		}
	}
}