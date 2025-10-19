import java.util.*;
public class FCP056
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int sum=0;
    int sub=0;
    int n=sc.nextInt();
    int[]arr=new int[n];
    int c=0;
     for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
        }
     for(int j=0;j<n;j++)
     {
        if(arr[j]%2==0)
         {
           sum=sum+arr[j];
          }
         else
          {
            sub=sub+arr[j];
           }
      }
    System.out.println(sub);
    System.out.println(sum);
  }
}
    