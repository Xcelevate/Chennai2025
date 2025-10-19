import java.util.Scanner;
public class FCP083
 {
   public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	 int a=sc.nextInt();
         int value=1;
	 for(int i=1;i<=a;i++)
          {
	    for(int k=1;k<=i;k++)
	    {
    	     System.out.print(value + " ");
       	      value+=1;
              }
	System.out.println("");
	}
    }
}