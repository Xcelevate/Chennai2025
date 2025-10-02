import java.util.*;
public class FCP065
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int d=0;
    float ans=0;
    int arr1[]=new int[n+m];
     for(int i=0;i<n;i++)
      {
        arr1[i]=sc.nextInt();
      }
     int arr2[]=new int[m];
     for(int j=0;j<m;j++)
      {
        arr2[j]=sc.nextInt();
      }
     for(int i=n,j=0;j<m;i++,j++)
     {
       arr1[i]=arr2[j];
      
      }
     for(int a=0;a<n+m;a++)
     {
       for(int k=a+1;k<n+m;k++)
	{ 
          if(arr1[a]>arr1[k])
           {
 	     int t=arr1[a];
             arr1[a]=arr1[k];
	     arr1[k]=t;
	    }
        }
      }
    int add=n+m;
    if(add%2==0)
    {
      d=add/2;
      add=arr1[d]+arr1[d-1];
      ans=(float)add/2;
      System.out.println(ans);
    }
   else
   {
     d=add/2;
     ans=(float)arr1[d];
     System.out.println(ans);
    }

   }
}