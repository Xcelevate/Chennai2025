import java.util.*;
public class FCP0058{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int[] arr=new int[N+1];
for(int i=0;i<N;i++){
	arr[i]=sc.nextInt();
}
int M=sc.nextInt();
int X=sc.nextInt();
for(int j=N;j>=M;j--){
	arr[j]=arr[j-1];
}
arr[M-1]=X;
for(int k=0;k<=N;k++){
	System.out.println(arr[k]);
}
}}