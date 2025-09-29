import java.util.*;
public class FCP060{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int[ ][ ]A=new int[N][N];
int temp2=0;
int i;
for(i=0; i<N; i++){
for(int j=0; j<=i; j++){
if(j==0 || j==i){
A[i][j]=1;
}
else{
A[i][j]=A[i-1][j-1]+A[i-1][j];
}
System.out.print(A[i][j] +" ");
}
System.out.println();
}
}
}