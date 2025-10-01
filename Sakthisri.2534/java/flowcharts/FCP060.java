import java.util.*;
public class FCP060{
public static void main(String[] args){
Scanner input=new Scanner (System.in);
int n=input.nextInt();
int a[][]=new int[n][n];
int k=1;
for(int row=0;row<n;row++){
 for(int col=0;col<=row;col++){
  if(col == 0 || col == n-1){
    a[row][col]=k;
  }
  
  else{
    a[row][col]=a[row-1][col-1]+a[row-1][col];
  }
}
}
for(int row=0;row<n;row++){
 for(int col=0;col<=row;col++){
  System.out.print(a[row][col]+" ");
}
System.out.println();
}
}
}