import java.util.*;
public class FCP065{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int M=Sc.nextInt();
int N=Sc.nextInt();
int[ ] a=new int[M];
int [ ]b=new int[N];
int i;
int j;
for(i=0; i<M; i++){
a [i]=Sc.nextInt();
}
for(j=0; j<N; j++){
b[j]=Sc.nextInt();
}
int [ ]c=new int[M+N];
i=0; j=0; int k=0;
	while(i<M && j<N){
	if(a[i]<b[j]){
	c[k++]=a[i++];
	}
	else{
	c[k++]=b[j++];
	}
	}
	while(i<M){
	c[k++]=a[i++];
	}
	while(j<N){
	c[k++]=b[j++];
	} 
i=(M+N)/2;
float median;
if((M+N)%2==0){
median=(float) (c[i]+c[i-1])/2;
}
else{
median=(float) c[i];
}
System.out.println(median);
}
}







































