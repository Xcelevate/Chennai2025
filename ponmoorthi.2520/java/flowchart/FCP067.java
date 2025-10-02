import java.util.*;
public class FCP067
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr1[]=new int[n];
     for(int i=0;i<n;i++)
      {
        arr1[i]=sc.nextInt();
      }
       for(int a=0;a<n;a++)
     {
       for(int k=a+1;k<n;k++)
	{ 
          if(arr1[a]>arr1[k])
           {
 	     int t=arr1[a];
             arr1[a]=arr1[k];
	     arr1[k]=t;
	    }
        }
      }
     for(int i=0;i<n;i++)
     {
       System.out.println(arr1[i]);
      }
    }
}