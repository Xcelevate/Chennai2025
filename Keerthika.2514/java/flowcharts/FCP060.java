import java.util.*;
public class FCP060{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int a[ ][ ]=new int[N][N];
int b=0;
for(int i=0;i<N;i++){
	for(int j=0;j<=i;j++){
		if(j==0||j==i){
			a[i][j]=1;
		}else{
			a[i][j]=a[i-1][j-1]+a[i-1][j];
		}
		System.out.print(a[i][j]+" ");
	}
	System.out.println();
}
}}