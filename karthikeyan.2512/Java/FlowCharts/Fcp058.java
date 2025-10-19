import java.util.*;
public class Fcp058{
	public static void main(String[]args){
		Scanner kk=new Scanner(System.in);
		int n=kk.nextInt();
		int []arr=new int[n+1];
		for(int i=0;i<n;i++){
			arr[i]=kk.nextInt();
		}
		int p=kk.nextInt();
		int x=kk.nextInt();
		for(int i=n;i>=p;i--){
			arr[i]=arr[i-1];
		}
		arr[p-1]=x;
		for(int i:arr){
			System.out.println(i);
		}
	}
}