import java.util.*;
public class FCP076{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int[][] A=new int[n][n];
int i=0;
int j=0;
for( j=0;j<A.length;j++){
 for(i=0;i<A[j].length;i++){
  A[j][i]=input.nextInt();
 }
}
int min=A[0][0];
for( j=0;j<A.length;j++){
 for(i=0;i<A[j].length;i++){
   if(A[j][i]<min){
    min=A[j][i];
   }
  }
}
  System.out.println(min);
}
}