import java.util.*;
public class FCP062
{
  public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] A=new int[n];
         int m=0;
        for(int i=0;i<n;i++)
           {
             A[i]=sc.nextInt();
            }
           int k=sc.nextInt();
            k=k%n;
           for(int j=1;j<=k;j++)
           {

		int i=0;
		int s=1;
		m=A[i];
		while(s<n)
		{
			A[i]=A[s];
			i++;
			s++;
		}
		A[n-1]=m;
	}
	for(int i=0;i<n;i++)
	{
	    System.out.println(A[i]);
	}
    }
}
