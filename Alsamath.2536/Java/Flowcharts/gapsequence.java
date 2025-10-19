import java.util.*;
public class gapsequence{
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<1 || n>100){
			return; 
		}
		if(n==1){
			System.out.println(n);
		}
		else{
			int s=1;
			for(int i=1;i<=n;i++){
				System.out.print(s+" ");
				s=s+i;
			}
		}
	}
}
			
			