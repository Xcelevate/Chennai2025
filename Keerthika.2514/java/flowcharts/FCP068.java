import java.util.*;
public class FCP068{
public static void main(String[] arg){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int a[]=new int[N];
for(int i=0;i<N;i++){
	a[i]=sc.nextInt();
}
int S=sc.nextInt();
int r=0;
int q=0;
boolean w=false;
for(int p=0;p<N;p++){
	q+=a[p];
	while(q>S && r<=p){
		q-=a[r];
		r++;
	}
	if(q==S){
		for(int k=r;k<=p;k++){
			System.out.println(a[k]);
		}
		w=true;
		break;
	}
}
if(!w){
	System.out.println("No Subarray found");
}
}}