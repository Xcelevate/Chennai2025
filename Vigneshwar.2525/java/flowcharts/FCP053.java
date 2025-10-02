import java.util.*;
public class FCP053{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int n =in.nextInt();
int[] A = new int[n];

int j = 1;
for(int i=0;i<n;i++){
A[i]=j;
System.out.println(A[i]);
j++;
}
}
}