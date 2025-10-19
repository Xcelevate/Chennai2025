import java.util.*;
public class FCP065{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int M=sc.nextInt();
int N=sc.nextInt();
int a[]=new int[M+N];
int b[]=new int[N];
for(int i=0;i<M;i++){
	a[i]=sc.nextInt();
}
for(int i=0;i<N;i++){
	b[i]=sc.nextInt();
}
int i=0;
for(int j=M;j<M+N;j++){
	a[j]=b[i];
	i++;
}
for(int k=0;k<M+N-1;k++){
	for(int j=k+1;j<M+N;j++){
		if(a[k]>a[j]){
			int temp=a[k];
			a[k]=a[j];
			a[j]=temp;
		}
	}
}
int p=M+N;
if(p%2==0){
	int d=p/2;
	int g=a[d]+a[d-1];
	float e=(float)g/2;
	System.out.println(e);
}else{
	int d=(p/2)+1;
	float g=(float)a[d-1];
	System.out.println(g);
}
}}