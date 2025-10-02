import java.util.*;
public class FCP058
{
    public static void main(String[]args)
    {
        Scanner a=new Scanner(System.in);
	int b=a.nextInt();
	int []c=new int[b+1];
	for(int d=0;d<b;d++)
         {
	    c[d]=a.nextInt();
          }
	int e=a.nextInt();
	int f=a.nextInt();
	for(int g=b;g>=e;g--)
        {
           c[g]=c[g-1];
	}
	c[e-1]=f;
	for(int h:c)
          {
        	System.out.println(h);
	  }
	}
}
