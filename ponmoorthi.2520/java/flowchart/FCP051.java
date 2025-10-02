import java.util.*;
public class FCP051
{
 public static void main(String[]args)
 {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int m=0;
    int k=0;
    
    while(a>=10)
    {
     int s=0;
      while(a>0)
      {
       m=a%10;
       s=s+m;
       a=a/10;
       }
     a=s;
    }
     
     System.out.print(a);
   
  
}
}