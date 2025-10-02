import java.util.*;
public class FCP048{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int M=sc.nextInt();
int N=sc.nextInt();
for(int i=M;i<N;i++){
int count=0;
int j=i;
	while(j>0){
		j=j/10;
		count=count+1;
	}
	int q=i;
	int d=0;
	while(q>0){
		int x=q%10;
		q=q/10;
		int r=0;
		int a=1;
		while(r<count){
			a=a*x;
			r=r+1;
		}
		d=d+a;
	}
if(d==i){
	System.out.println(i);
}
}
}} 