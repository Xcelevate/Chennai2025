import java.util.*;
public class Fcp048{
	public static void main(String[]args){
		Scanner kk=new Scanner(System.in);
		int m=kk.nextInt();
		int n=kk.nextInt();
		int h,sum,r,c;
		for(int i=m;i<=n;i++){
			h=i;
			c=0;
			sum=0;
			while(h>0){
				c +=1;
				h /=10;
			}
			h=i;
			while(h>0){
				r=h%10;
				sum += Math.pow(r,c);
				h /=10;
			}
			if(i==sum){
			System.out.println(i);
			}
		}
	}
}