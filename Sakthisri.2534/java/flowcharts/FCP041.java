import java.util.*;
public class FCP041{
public static void main(String[] args){
int t=0;
Scanner input=new Scanner(System.in);
int n=input.nextInt();
long[] A=new long[n];
for(int i=0;i<n;i++){
A[i]=input.nextLong();
}

for(int i=0;i<n;i++){
for(int j=0;j<n-1;j++){
if(A[j]>A[j+1]){
t=(int) A[j];
A[j]=A[j+1];
A[j+1]=t;
}
}
}
int k=1;
for(int i=1;i<n;i++){
if(A[i]!=A[i-1]){
A[k]=A[i];
k++; 
}
}
if(k>=3){
System.out.println(A[n-3]);
}
}
}