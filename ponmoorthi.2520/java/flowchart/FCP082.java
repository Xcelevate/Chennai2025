import java.util.*;
public class FCP082
{
   public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
  	for(int i=a;i>0;i--)
	{
        for(int k=1; k<=i;k++)
	{
         System.out.print("* ");
        }
       System.out.println("");
      }
  }
}