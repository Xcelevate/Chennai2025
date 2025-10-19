import java.util.*;
public class FCP037
{
  public static void main(String[]args)
  {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m= 0;
	for(int i=1;i<=n/2;i++)
	{
	 if(n%i==0)
	 {
	 m+=i;
	 }
	}
	if(m==n && n>1)
	{
	System.out.println("Yes");
	}
	else{
	System.out.println("No");
	}
   }
}
