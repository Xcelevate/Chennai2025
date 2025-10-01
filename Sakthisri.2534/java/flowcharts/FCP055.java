
import java.util.*;
public class FCP055{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int[] A=new int[n];
int s=0;
for(int i=0;i<n;i++){
A[i]=input.nextInt();
}
int t=input.nextInt();
for(int i=0;i<n;i++){
if(A[i]==t){
System.out.println("Yes");
return;
}
}
System.out.println("No");
}
}