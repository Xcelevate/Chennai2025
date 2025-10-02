import java.util.*;
public class FCP057{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int m=s.nextInt();
	int a[]=new int[n];
	for(int i=0;i<n;i++){
	a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++){
	if(i>=m-1)
	{
	  if(i==n-1)
	  {
	   break;
	   }
	 a[i]=a[i+1];
	 }
	}
	int i=0;
	while((n-1)>i)
	{
	System.out.println(a[i]);
	i++;
	}
    }
}