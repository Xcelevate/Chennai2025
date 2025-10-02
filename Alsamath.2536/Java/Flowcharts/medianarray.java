import java.util.*;
public class medianarray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n=n1+n2;
		double result=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		int t=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		if(n%2!=0){
			result = arr[(n/2)];
		}
		else{ 
			result = ((double)(arr[(n/2)-1]+arr[(n/2)])/2);
		}
		System.out.println(result);
		
	}
}
					
					
		
			