import java.util.*;
public class FCP041{
public static void main(String[] args){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
long[] A=new long[n];
for(int i=0;i<n;i++){
A[i]=in.nextLong();
}
Arrays.sort(A);
int k=1;
for(int i=1;i<n;i++){
if(A[i]!=A[i-1]){
A[k]=A[i];
k++;
}
}
if(k>=3){
System.out.println(A[k-3]);
}
else{
if(n>=3){
System.out.println(A[n-3]);
}
else if(n>0){
System.out.println(A[0]);
}
}
}
}
