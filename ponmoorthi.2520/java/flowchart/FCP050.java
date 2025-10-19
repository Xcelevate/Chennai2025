import java.util.*;
public class FCP050
{
  public static void main(String[]args)
  {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int s=2;
	while(s<=n){
	int i=2;
	while(i<s)
	{
	  if(s%i==0)
	  {
	    break;
	   }
	 i++;
	}
	 if(n%s==0 && i==s){
	 System.out.print(s + " ");
	}
	s++;
	}
  }
}
