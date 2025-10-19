import java.util.*;
public class FCP052{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
long[]arr=new long[N];
for(int i=0;i<N;i++){
	arr[i]=sc.nextLong();
}
for(int j=0;j<N;j++){
	System.out.println(arr[j]);
}
}}