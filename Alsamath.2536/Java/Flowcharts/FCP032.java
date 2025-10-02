import java.util.*;
public class FCP032{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n;
		int c=0;
		if(n<1){
			return;
		}
		for(int i=1;i<=n;i++){
			if(m%i==0){
				c+=1;
			}
		}
		if(c==3){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
		
			