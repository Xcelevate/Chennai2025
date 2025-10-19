import java.util.*;
public class FCP059{
public static void main(String[]args){
Scanner in = new Scanner(System.in);

int n=in.nextInt();
int[] A = new int[n];
for(int i = 0;i<n;i++){
A[i]=in.nextInt();
}
int c=0;
boolean[] B = new boolean[n];
for(int i=0;i<n;i++){
if(B[i]){
continue;
}
for(int j=i+1;j<n;j++){
if(A[i]==A[j]){
B[j]=true;
c++;
}
}
if(c>0){
System.out.println(A[i]);
}
c=0;
}
}
}

