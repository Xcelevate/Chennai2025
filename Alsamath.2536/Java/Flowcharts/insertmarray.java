import java.util.*;
public class insertmarray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n+1];
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			
		}
		int area=sc.nextInt();
		area=area-1;
		int element=sc.nextInt();
		
		for(int j=n;j>area;j--){
			arr[j]=arr[j-1];
		}
		for(int i=0;i<=n;i++){
			if(i==area){
				arr[i]=element;
				}
			}
		
		for(int data :arr){
			System.out.println(data);
		}
		
	}
}