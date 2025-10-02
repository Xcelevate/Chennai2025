import java.util.*;
public class FCP046
{
 public static void main(String[]args)
 {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(int i=1;i<=n;i++)
     {
      if(i==1)
       { 
         System.out.println("*");
        }
       else if(i==2)
       {
         System.out.println("* *");
        }

      else if(i==n)
      {
        for(int k=1;k<=n;k++)
         {
          System.out.print("* ");
         }
         System.out.println();
       }
      else
        {
            System.out.print("*");
             
 	     for(int s=1;s<=i*2-3;s++)
	     {
    	       System.out.print(" ");
               }
        	
		  System.out.print("*");
		  System.out.println();
	      }

          }    

      }
}  
           
      

