import java.util.*;
public class FCP066{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int M=Sc.nextInt();
int N=Sc.nextInt();
int[ ] a=new int[M+N];
int [ ]b=new int[M+N];
int i;
int j;
int c=0;
for(i=0; i<M; i++){
a [i]=Sc.nextInt();
}
for(j=0; j<N; j++){
b[j]=Sc.nextInt();
}
for(i=M; i<M+N; i++){
for(j=0; j<N; j++){
a[i]=b[j];
}
}
for(i=0; i<M+N-1; i++){
for(j=i+1; j>0; j--){
if(a[j]<a[j-1]){
int temp=a[j];
a[j]=a[j-1];
a[j-1]=temp;
}
else{
break;
}
}
}
int k=0;
for(i=0; i<M+N; i++){
for(j=0; j<M+N; j++){
if(a[j]!=a[j+1]){
System.out.println(a[i]);
}
else{
System.out.println(a[i]);
b[k]=a[i++];
c++;
k++;
}
}
}
for(i=0; i<=c; i++){
System.out.println(b[i]);
}
}
}