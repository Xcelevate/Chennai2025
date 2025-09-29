import java.util.*;
public class FCP058{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int[ ] A=new int[ N+1 ];
int i=0;
for(i=0; i<N; i++){
A[ i ]=Sc.nextInt();
}
int M=Sc.nextInt();
int X=Sc.nextInt();
for(int j=N; j>=M; j--){
A[j]=A[j-1];
}
A[M-1]=X;
i=0;
while(i<=N){
System.out.println(A[i]);
i++;
}
}
}