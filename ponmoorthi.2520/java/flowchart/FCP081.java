import java.util.Scanner;
public class FCP081{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	 for(int s=1;s<=a;s++)
	  {
 	   for(int i=1;i<=a-s;i++)
	    {
      		  System.out.print("  ");
             }
           for(int k=1;k<=s;k++){
 		System.out.print("* ");
    	    }
         	 System.out.println("");  
         }
    }
}