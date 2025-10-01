import java.util.*;
public class FCP058
{
 public static void main(String[] args)
 {
  Scanner input=new Scanner(System.in);
  int n=input.nextInt();
  int[] A=new int[n+1];
  int t=0;
  int t1=0;
  for(int i=0;i<n;i++)
  {
   A[i]=input.nextInt();
  }
  int m=input.nextInt();
  int x=input.nextInt();
  for(int i=n;i>m-1;i--)
  {
   A[i]=A[i-1];
  }
  A[m-1]=x;
  for(int i=0;i<n+1;i++){
  System.out.println(A[i]);
  }
}
}
   