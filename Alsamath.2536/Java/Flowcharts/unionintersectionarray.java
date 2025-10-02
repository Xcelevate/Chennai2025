import java.util.*;
public class unionintersectionarray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n=n1+n2;
		int arr[]=new int[n];
		int union[]=new int[n];
		int intersection[]=new int[n];
		
		int c=1;
		int t=0;
		int m=0;
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]==arr[j] && arr[j]>0){
					c=c+1;
					arr[j]=0;
				}
			}
			union[m]=arr[i];
		
			if(c>1){
				intersection[m]=arr[i];
			}
			m=m+1;
			c=1;
		}
		
		for(int i=0;i<n;i++){
			if(union[i]>0){
				for(int j=i+1;j<n;j++){
					if(union[i]>union[j] && union[j]>0){
						t=union[i];
						union[i]=union[j];
						union[j]=t;
					}
				}
			}
		} 
		
		for(int element:union){ if(element >0){ System.out.println(element+" "); } }
		
		for(int element:intersection){ if(element >0){ System.out.println(element+" "); } }
	}
}	