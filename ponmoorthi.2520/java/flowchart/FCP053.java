import java.util.*;
public class FCP053
{ 
  public static void main(String[]args)
  {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[] arr=new int[n];
  int k=1;
  int i=0;
   while(k<=n)
     {
      arr[i]=k;
       k++;
       i++;
     }
   for(int a=0;a<n;a++)
   {
    System.out.println(arr[a]);
 
    } 
   
}}