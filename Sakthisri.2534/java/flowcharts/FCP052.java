import java.util.*;
public class FCP052{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int[] A=new int[n];
for(int i=0;i<n;i++){
A[i]=input.nextInt();
}
for(int i=0;i<n;i++){
System.out.println(A[i]);
}
}
}