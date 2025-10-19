import java.util.*;
public class mergesortedarray{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		int fin[]=new int[n1+n2];
		int s=0;
		int r=0;
		for(int i=1;i<=(n1+n2);i++){
			if(i<=n1){
				arr1[s]=sc.nextInt();
				s=s+1;
			}
			else{
				arr2[r]=sc.nextInt();
				r=r+1;
			}
		}
		
		for(int data:arr1){
			System.out.print(data+" ");
		}
		System.out.println();
		for(int data:arr2){
			System.out.print(data+" ");
		}
		System.out.println();
		int val=0;
		int s1=0;
		int r1=0;
		for(int i=0;i<n1;i++){
			int a=arr1[s1];
			for(int j=0;j<n2;j++){
				if(a<arr2[r1]){	
					if(s1<n1){
						fin[val]=a;
						s1=s1+1;
					}
				}
				else{
					if(r1<n2){
						fin[val]=arr2[r1];
						r1=r1+1;
					}
				}
			}
			val=val+1;
		}
		for(int data:fin){
			System.out.print(data+" ");
		}
		
		
	}
}