import java.util.*;
public class FCP054{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int[] A=new int[n];

for(int i=0;i<n;i++){
A[i]=in.nextInt();
}
for(int j=n-1;j>=0;j--){
System.out.println(A[j]);
}
}
}