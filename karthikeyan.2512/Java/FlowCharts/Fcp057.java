import java.util.*;
public class Fcp057{
	public static void main(String[]args){
		Scanner kk=new Scanner(System.in);
		int n=kk.nextInt();
		int p=kk.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++){
	         arr[i]=kk.nextInt();
        }
		for(int i=p-1;i<n-1;i++){
			arr[i]=arr[i+1];
		}
		for(int i=0;i<n-1;i++){
			System.out.println(arr[i]);
		}
	}
}