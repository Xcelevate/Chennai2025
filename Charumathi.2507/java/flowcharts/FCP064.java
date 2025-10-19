import java.util.*;
public class FCP064{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int M=Sc.nextInt();
int N=Sc.nextInt();
int[ ]A=new int[M];
int[ ]B=new int[N];
for(int i=0; i<M; i++){
A[i]=Sc.nextInt();
}
for(int j=0; j<N; j++){
B[j]=Sc.nextInt();
}
int[ ]C=new int[M+N];
int i=0, j=0, k=0;
while(i<M && j<N){
if(A[i]<B[j]){
C[k++]=A[i++];
}
else{
C[k++]=B[j++];
}
}
while(i<M){
C[k++]=A[i++];
}
while(j<N){
C[k++]=B[j++];
}
for(int l=0; l<M+N; l++){
System.out.println(C[l]);
}
}
}
