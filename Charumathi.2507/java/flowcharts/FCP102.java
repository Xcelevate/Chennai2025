import java.util.*;
public class FCP102{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int K=Sc.nextInt();
int c=0;
for(int i=N; i>=1; i--){
if(N%i==0){
c++;
	if(c==K){
	System.out.println(i);
	return;
	}
}
}
System.out.println(-1);
}
}