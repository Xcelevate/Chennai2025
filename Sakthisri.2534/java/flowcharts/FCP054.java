import java.util.*;
public class FCP054{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int t=n;
int j=0;
int[] A=new int[n];
for(int i=0;i<n;i++){
A[i]=input.nextInt();
}
j=t-1;
while(j>=0){
System.out.println(A[j]);
j=j-1;
}
}
}