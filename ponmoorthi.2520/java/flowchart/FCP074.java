import java.util.*;
public class FCP074  
{
  public static void main(String[]args)
   {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[][]A=new int[n][n];
	int ans=0;
	for(int i=0;i<n;i++)
	{
	   for(int j=0;j<n;j++)
           {			
	      A[i][j]=sc.nextInt();
	     }  
	}
	int[][]B=new int[n][n];
	for(int i=0;i<n;i++)
         { 
	    for(int j=0;j<n;j++)
            {
	     B[i][j]=sc.nextInt();
	    }  
	}
	for(int i=0;i<n;i++)
        {
	  for(int j=0;j<n;j++)
          {
	    ans=A[i][j]-B[i][j];
	    System.out.println(ans);
	  }
	}
    }
}