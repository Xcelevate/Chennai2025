import java.util.*;
public class FCP037{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long c=0;
		if(n>1 && n<1000000){
		
		
			for(long i=1;i<=n/2;i++){
				if(n%i==0){
					c+=i;
				}
			}
			if(c==n){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	}
}