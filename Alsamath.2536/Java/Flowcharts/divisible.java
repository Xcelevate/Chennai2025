import java.util.*;
public class divisible{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int result=0;
		int n=sc.nextInt();
		int d=sc.nextInt();
		if(n%d!=0){
			result=d*(n/d);
		}
		else{
			result=d*((n/d)-1);
		}
		System.out.println(result);
	}
}	