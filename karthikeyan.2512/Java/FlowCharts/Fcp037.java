import java.util.*;
public class Fcp037{
	public static void main(String[]args){
		Scanner kk=new Scanner(System.in);
		int a=kk.nextInt();
		int sum=0;
		for(int i=1;i<a;i++){
			if(a%i==0){
			    sum +=i;
			}
		}
		if(sum==a && a!=0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}