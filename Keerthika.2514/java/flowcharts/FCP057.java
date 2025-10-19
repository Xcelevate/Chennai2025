import java.util.*;
public class FCP057{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int M=sc.nextInt();
Long[] arr=new Long[N];
for(int i=0;i<N;i++){
	arr[i]=sc.nextLong();
}
for(int j=0;j<N-1;j++){

	if(j+1>=M){
		arr[j]=arr[j+1];
		System.out.println(arr[j]);
		
	}else{
		System.out.println(arr[j]);
	}
}
}}