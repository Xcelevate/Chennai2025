import java.util.*;
public class factorialcheck{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0;
		int temp=n;
		int fact=1;
		int sum=0;
		if(n==0){
			System.out.println("NO");
			return;
		}
		
		for(int i=n;n>0;n=n/10){
			rem=n%10;
			if(rem==0){
				fact=1;
			}
			else{ 
				fact=1;
				for(int j=1;j<=rem;j++){
					fact=fact*j;
				}
			}
			sum=sum+fact;
		} 
		if (sum==temp){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}
				