import java.util.*;
public class FCP062{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int[] arr=new int[N];
int temp=0;
for(int i=0;i<N;i++){
	arr[i]=sc.nextInt();
}
int K=sc.nextInt();
for(int j=0;j<K;j++){
	for(int k=0;k<N-1;k++){
		temp=arr[k];
		arr[k]=arr[k+1];
		arr[k+1]=temp;
	}
}
for(int i=0;i<N;i++){
	System.out.println(arr[i]);
}
}}