import java.util.*;
public class FCP075{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int[][] A=new int[n][n];
int[][] B=new int[n][n];
int row=0;
int col=0;
int row1=0;
for(row=0;row<A.length;row++){
 for(col=0;col<A[row].length;col++){
  A[row][col]=input.nextInt();
 }
}

for(row=0;row<A.length;row++){
 for(col=0;col<A[row].length;col++){
  B[row][col]=A[col][row];
 }
}

for(int[] num:B){
 for(int num2:num){
  System.out.println(num2);
}
}
}
}
