import java.util.*;
public class FCP067{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int a[]=new int[N];
for(int i=0;i<N;i++){
	a[i]=sc.nextInt();
}
for(int i=0;i<N;i++){
	for(int j=0;j<N-1;j++){
		if(a[j]>a[j+1]){
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
	}
}
for(int i=0;i<N;i++){
	System.out.println(a[i]);
}
}}