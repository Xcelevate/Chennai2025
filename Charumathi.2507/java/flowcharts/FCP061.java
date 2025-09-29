import java.util.*;
public class FCP061{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int[ ]A=new int[N];
int i=0;
for(i=0; i<N; i++){
A[i]=Sc.nextInt();
}
boolean[ ] comp=new boolean[N];
for(i=0; i<N; i++){
if(comp[i]){
continue;
}
int c=1;
int j;
for(j=i+1; j<N; j++){
if(A[j]==A[i]){
comp[j]=true;
c++;
}
}
System.out.println(A[i]+" - "+c);
}
}
}