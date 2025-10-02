import java.util.*;
public class FCP027{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=0;
		double div=0;
		
		for (int i=1;i<=n;i++){
			div=(float)1/i;
			sum+=div;
			
		}
		System.out.printf("%.2f",sum);
	}
}