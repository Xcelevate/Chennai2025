import java.util.*;
public class Balancedcheckaverage{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=0;
		if(n%2!=0 || n==0 ){
			return;
		}
	
		for(int i=1;i<=n;i++){
			int s=sc.nextInt();
			if(i<=n/2){
				a+=s;
			}
			else{
				b+=s;
			}
		}
		if(a==b){
			System.out.println("Balanced");
		}
		else{
			System.out.println("Unbalanced");
		}
	}
}
				