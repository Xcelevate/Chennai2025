import java.util.*;
public class FCP059{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int a[]=new int[N];
int dupli=0;
for(int i=0;i<N;i++){
	a[i]=sc.nextInt();
}
int count=0;
for(int j=0;j<N;j++){
	for(int k=j+1;k<N;k++){
		if(a[j]==a[k]){
			count=count+1;
			a[k]=-1;
		}
	}
	if(count>=1&&a[j]!=-1){
		System.out.println(a[j]);
	}
count=0;
}
}}