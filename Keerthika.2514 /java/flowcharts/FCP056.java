import java.util.*;
public class FCP056{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int c1=0;
int c2=0;
int[] arr=new int[N];
for(int i=0;i<N;i++){
	arr[i]=sc.nextInt();
}
for(int j=0;j<N;j++){
	if(arr[j]%2==0){
		c1=c1+arr[j];
	}else{
		c2=c2+arr[j];
	}
}
System.out.println(c2);
System.out.println(c1);
}}
