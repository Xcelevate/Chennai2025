import java.util.*;
public class FCP063{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int N=sc.nextInt();
int a[]=new int[N];
for(int i=0;i<N;i++){
	a[i]=sc.nextInt();
}
int b=0;
int c=0;
for(int i=0;i<N;i++){
	 if(a[i]==1){
		c++;
	}else{
		if(b<c){
			b=c;
		}
		c=0;
	}
}
if(b<c){
	b=c;
}
System.out.println(b);
}}