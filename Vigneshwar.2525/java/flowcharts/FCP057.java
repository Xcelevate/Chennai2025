import java.util.*;
public class FCP057{
public static void main(String args[])
{
	Scanner a=new Scanner(System.in);
	int b=a.nextInt();
	int c=a.nextInt();
	int d[]=new int[b];
	for(int e=0;e<b;e++){
	d[e]=a.nextInt();
	}
	for(int e=0;e<b;e++){
	if(e>=c-1)
	{
	  if(e==b-1)
	  {
	   break;
	   }
	 d[e]=d[e+1];
	 }
	}
	int e=0;
	while((b-1)>e)
	{
	System.out.println(d[e]);
	e++;
	}
    }
}
