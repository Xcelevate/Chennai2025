import java.util.*;
public class FCP055
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[]arr=new int[n];
    int c=0;
     for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
        }
    int m=sc.nextInt();
     for(int j=0;j<n;j++)
    {
      if(arr[j]==m)
      {
       c=c+1;
       }
       else{
        }
     }  
      if(c>0)
      {
       System.out.println("Yes");
       }
     else
     {
      System.out.println("No");
     } 

     
 }
}
    
