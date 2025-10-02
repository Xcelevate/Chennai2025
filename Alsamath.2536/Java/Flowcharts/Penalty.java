import java.util.*;
public class Penalty{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int Amount=s.nextInt();
		int days=s.nextInt();
		int result=0;
		double M=0;
		if(days==0){
			result=Amount;
		}
		else if(days<=5){
			result=Amount+100;
		}
		else if(days<=9){
			M=Amount*0.02;
			result=(int)(Amount+500+M);
			
		}
		else{
			M=Amount*0.15;
			result=(int)(Amount+1000+M);
			
		}
		
		System.out.println(result);

	}
}