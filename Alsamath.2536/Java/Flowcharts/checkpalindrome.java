import java.util.*;
public class checkpalindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int s=n;
		int t=0;
		int r=0;
		
		for (int i=s;i>0;i=i/10){
		
			r=i%10;
			t=t*10+r;
		}
		if(n==t){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
			