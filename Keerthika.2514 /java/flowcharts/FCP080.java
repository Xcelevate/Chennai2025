import java.util.*;
public class FCP080{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int M=sc.nextInt();
int a[]=new int[N];
int b[]=new int[M];
long p=0;
long f=0;
for(int i=0;i<N;i++){
	a[i]=sc.nextInt();
}
for(int i=0;i<M;i++){
	b[i]=sc.nextInt();
}
for(int i=0;i<N;i++){
	int e=a[i];
	p=p*10+e;
}
for(int i=0;i<M;i++){
	int d=b[i];
	f=f*10+d;
}
long product=p*f;
long k=product;
int count=0;
while(k>0){
	long r=(long)k%10;
	k=k/10;
	count++;
}
long c[]=new long[count];
for(int i=count-1;i>=0;i--){
	long r=(long)product%10;
	product=product/10;
	c[i]=r;
}
for(int i=0;i<count;i++){
	System.out.println(c[i]);
}
}}
