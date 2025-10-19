import java.util.*;
public class quotientremainder{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int max=0;
		int min=0;
		
		int quotient=0;
		int remainder=0;
		
		if(a<1 || b<1){
			return;
		}	
		
		if(a>b){
			max=a;
			min=b;
		}
		else{
			max=b;
			min=a;
		}
		quotient =(int)a/b;
		remainder=a%b;
		
		System.out.println(quotient);
		System.out.println(remainder);
	}
}