//Rotate Array by K Positions


import java.util.*;
public class Fcp062{
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
        int n=kk.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=kk.nextInt();
		}
		int m=kk.nextInt();
		if(n<=m){m = m%n;}
		int temp,j;
		for(int i=1;i<=m;i++){
			temp=arr[0];
			j=1;
			while(j<n){
				arr[j-1]=arr[j];
				j++;
			}
			arr[n-1]=temp;
		}
		for(int z:arr){
			System.out.println(z);
		}
	}
}