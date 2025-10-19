import java.util.*;
public class FCP089{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
Object[ ][ ] A=new Object[N][N];
int i;
int j;
for(i=0; i<=(N-1)/2; i++){
for(j=0; j<N; j++){
if(j>=i && i+j<=N-1){
A[i][j]=0;
}
else{
A[i][j]='x';
}
}
}
for(i=(N-1)/2+1; i<N; i++){
for(j=0; j<N; j++){
if(i+j>=N-1 && j<=i){
A[i][j]=0;
}
else{
A[i][j]='x';
}
}
}
for(i=0; i<N; i++){
for(j=0; j<N; j++){
System.out.print(A[i][j]+"   ");
}
System.out.println();
}
}
}