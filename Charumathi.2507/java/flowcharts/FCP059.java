import java.util.*;
public class FCP059{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int[ ]arr=new int[N];
int i=0;
int c=0;
for(i=0; i<N; i++){
arr[i]=Sc.nextInt();
}
boolean[ ] comp=new boolean[N];
for(i=0; i<N; i++){
if(comp[i]){
continue;
}
int c=1;
int j;
for(j=i+1; j<N; j++){
if(arr[j]==arr[i]){
comp[j]=true;
c++
}
}
if(c>1){
System.out.println(arr[i]);
}
}
}
}

