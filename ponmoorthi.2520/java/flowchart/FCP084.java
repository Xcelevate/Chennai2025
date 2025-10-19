import java.util.*;
public class FCP084 
{
 public static void main(String[] args) 
   {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
	System.out.println("0");
	int v=2;		
	if(n>1)
	{
	  for(int i=2;i<=n;i++){
               for(int j=1;j<=i;j++){
	       if(j==1){
		   System.out.print(v+" ");
		   v*=2;
		   }
 	       else{
	       System.out.print(v+" ");
 	          }
	   }
        System.out.println();
	}
      }
   }
}