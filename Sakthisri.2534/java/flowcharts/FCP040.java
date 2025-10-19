import java.util.*;
public class FCP040{
public static void main(String[] args){
int T=0;
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int[] A=new int[n];
for(int i=0;i<n;i++){
A[i]=input.nextInt();
}
for(int i=0;i<n;i++){
for(int j=0;j<n-1;j++){
if(A[j]>A[j+1]){
T=A[j];
A[j]=A[j+1];
A[j+1]=T;
}
}
}
System.out.println(A[n-2]);
}
}

