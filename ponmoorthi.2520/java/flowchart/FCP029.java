import java.util.*;
public class FCP029
{
public static void main(String[]arg)
{
  Scanner sc=new Scanner(System.in);
  int m=sc.nextInt();
  int a=0;
  int sum=0;
  while(m!=0)
  {
  a=m%10;
  sum=sum+a;
  m=m/10;
   }
System.out.println(sum);
}}
