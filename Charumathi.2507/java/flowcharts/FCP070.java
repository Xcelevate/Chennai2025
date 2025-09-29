import java.util.*;
public class FCP070{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int[ ]A=new int[N];
int i;
for(i=0; i<N; i++){
A[i]=Sc.nextInt();
}
int tar=Sc.nextInt();
int L=0;
int R=N-1;
boolean exist=false;
while(L<=R){
int mid=(L+R)/2;
if(A[mid]==tar){
System.out.println("Yes");
exist=true;
break;
}
else if(A[mid]<tar){
L=mid+1;
}
else{
R=mid-1;
}
}
if(!exist){
System.out.println("No");
}
}
}