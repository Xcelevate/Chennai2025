import java.util.*;
public class sumofdigitsinarray{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n=n1+n2;
		
		
		
		int arr[]=new int[n];
		int a[]=new int[n1];
		int b[]=new int [n2];
		
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(i<n1){
				a[i]=arr[i];
			}
			else{
				b[i]=arr[i];
			}
		} 
		int m=0;
		int n=0;
		int x=1;
		for(int i=0;i<n1;i++){
			m=m+x*arr[i];
			x=x*10;
		}
		System.out.println(m);
			
		
	}
}
		
		