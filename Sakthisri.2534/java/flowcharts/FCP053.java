import java.util.*;
public class FCP053{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int[] A=new int[n];
int s=1;
for(int i=0;i<n;i++){
A[i]=s;
s++;
}
for(int i=0;i<n;i++){
System.out.println(A[i]);
}
}
}