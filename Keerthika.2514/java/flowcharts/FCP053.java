import java.util.*;
public class FCP053{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int[]arr=new int[N];
int k=1;
for(int i=0;i<N;i++){
arr[i]=k;
k++;
}
for(int j=0;j<N;j++){
	System.out.println(arr[j]);
}
}}