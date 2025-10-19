import java.util.*;
public class FCP055{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int[] arr=new int[N];
int count=0;
for(int i=0;i<N;i++){
	arr[i]=sc.nextInt();
}
int M=sc.nextInt();
for(int j=0;j<N;j++){
	if(arr[j]==M){
		count=count+1;
	}
}
if(count>=1){
System.out.println("Yes");
}else{
System.out.println("No");
}
}}