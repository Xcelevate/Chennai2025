import java.util.*;
public class DigitSum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int start=sc.nextInt();
		int end=sc.nextInt();
		int sum=0;
		int r=0;
		for (int i=1;i<=N;i++){
			for (int j=i;j>0;j++){
				if(j>=start || j<=end){
					sum+=j;
				}
				else{
					r=j%10;
					j=j/10;
				}
			}
		}
		System.out.println(sum);
	}
}
				