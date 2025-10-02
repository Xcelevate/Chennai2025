import java.util.*;
public class FCP038
{
public static void main(String[]args)
{
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int a=0;
 int sum=0;
 int c=0;
 int Q=n;
 while(n>0)
 {
  a=n%10;
  c=a*a*a;
  sum=sum+c;
  n=n/10;
  }
 if(Q==sum)
 {
  System.out.println("yes");
  }
  else
  {
   System.out.println("no");
   }
}
}
