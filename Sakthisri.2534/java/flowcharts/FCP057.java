import java.util.*;
public class FCP057{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int m=input.nextInt();
int t=0;
int[] A=new int[n];
for(int i=0;i<n;i++){
A[i]=input.nextInt();
}
for(int i=0;i<n;i++){
if(m-1==i){
for(int j=m-1;j<n-1;j++){
t=A[j];
A[j]=A[j+1];
}
}
}
for(int i=0;i<n-1;i++){
System.out.println(A[i]);
}
}
}
