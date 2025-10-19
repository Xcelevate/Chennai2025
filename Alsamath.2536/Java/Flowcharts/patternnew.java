import java.util.*;
public class patternnew{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int a=1;
		
		
		int n=sc.nextInt();
		int m=0;
		
		int b=n-1;
		
		for(int i=1;i<=(2*n)-1;i++){
		  if(i<=n){
			for(int j=n-i;j>=1;j--){
				System.out.print(" ");
			    
			}	
			for(int j=1;j<i;j++){
				System.out.print(j);
				
			}
			for(int j=a;j>0;j--){
				System.out.print(j);
			}
			a++;

			System.out.println();
		  }
		 
		  else{
			  
			for(int j=1;j<=i-n;j++){
				System.out.print(" ");
			    
			}	
			for(int j=1;j<=b;j++){
				System.out.print(j);
				
			}
			for(int j=b-1;j>0;j--){
				System.out.print(j);
			}
			b--;

			System.out.println();
		  }
			  
			
		}
	}
}




  
	