import java.util.*;
public class alternatingpowerseries{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double m=sc.nextDouble();
		double sum=0;
		double val=0;
		int j=1;
		for(int i=1;i<=n;i++){
			val=Math.pow(m,j)/j;
			if(i%2!=0){
				sum+=val;
				j=j+2;
			}
			else{
				sum-=val;
				j=j+2;
			}
		}
		System.out.println(sum);
	}
}
				