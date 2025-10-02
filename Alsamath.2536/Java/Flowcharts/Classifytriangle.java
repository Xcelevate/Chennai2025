import java.util.*;
public class Classifytriangle{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int max=0;
		long min=0;
		
		
		if(a+b>c && b+c>a && c+a>b){
			if(a>b && a>c){
				max=a;
				min=(b*b)+(c*c);
			}
			else if(b>a && b>c){
				max=b;
				min=(a*a)+(c*c);
			}
			else{
				max=c;
				min=(a*a)+(b*b);
			}
			long result = (max*max)-min;
			
			if(result==0){
				System.out.println("Right");
				return;
			}
			else if(result>0){ System.out.println("Obtuse");return; }
			
			else{ System.out.println("Acute"); return;}
		}
		else{
			System.out.println("Invalid");
			return;
		}
	}
}