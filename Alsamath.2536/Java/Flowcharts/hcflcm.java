import java.util.*;
public class hcflcm{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int max=0;
		long hcf=1;
		long lcm=0;
		if(m>n){ max=m; }
		else { max=n; }
		for(int i=2;i<=max;i++){
			if(m%i ==0 && n%i ==0){
				hcf=i;
				
			}
		}
		lcm=(long)m*n/hcf;
		
		System.out.println(hcf);
		System.out.println(lcm);
	}
}