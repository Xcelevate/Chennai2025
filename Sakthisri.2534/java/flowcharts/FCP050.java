import java.util.*;
public class FCP050{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
long n=input.nextInt();
int c=0;
for(int i=2;i<=n;i++) 
{  
  for(int j=1;j<=i;j++)
   {
     if(i%j==0)
      {
       c=c+1;
       }
    }
    if(c==2)
     {
        if(n%i==0)
         {
          System.out.println(i);
         }
      }
      c=0;
 }
}
}