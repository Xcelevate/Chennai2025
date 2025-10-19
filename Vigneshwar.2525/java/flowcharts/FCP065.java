import java.util.*;
public class FCP065
{
  public static void main(String[]args)
  {
    Scanner a=new Scanner(System.in);
    int b=a.nextInt();
    int c=a.nextInt();
    int d=0;
    float e=0;
    int f[]=new int[b+c];
     for(int g=0;g<b;g++)
      {
        f[g]=a.nextInt();
      }
     int h[]=new int[c];
     for(int i=0;i<c;i++)
      {
        h[i]=a.nextInt();
      }
     for(int j=b,k=0;k<c;j++,k++)
     {
       f[j]=h[k];
      
      }
     for(int l=0;l<b+c;l++)
     {
       for(int m=l+1;m<b+c;m++)
	{ 
          if(f[l]>f[m])
           {
 	     int n=f[l];
             f[l]=f[m];
	     f[m]=n;
	    }
        }
      }
    int o=b+c;
    if(o%2==0)
    {
      d=o/2;
      o=f[d]+f[d-1];
      e=(float)o/2;
      System.out.println(e);
    }
   else
   {
     d=o/2;
     e=(float)f[d];
     System.out.println(e);
    }

   }
}
