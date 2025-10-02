import java.util.*;
public class FCP074{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int[][] A=new int[n][n];
int[][] B=new int[n][n];
int[][] C=new int[n][n];
int row=0;
int col=0;
for(row=0;row<A.length;row++){
 for(col=0;col<A[row].length;col++){
  A[row][col]=input.nextInt();
}
}

for(row=0;row<B.length;row++){
 for(col=0;col<B[row].length;col++){
  B[row][col]=input.nextInt();
}
}

for(row=0;row<C.length;row++){
 for(col=0;col<C[row].length;col++){
  C[row][col]=A[row][col]-B[row][col];
}
}
for(int[] num:C){
 for(int num2:num){
  System.out.println(num2);
}

}
}
}