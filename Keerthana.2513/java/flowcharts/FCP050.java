import java.util.*;
public class FCP050{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
int r;
for(int i=2;i<n;i++)
{
        count=0;
	if(n%i==0)
        
	{
		for(r=2;r<i;r++)
		{
		       
			if(i%r==0)
			{
			count=count+1;
			}
			else{}
	
		}
				if(count==0)
				{
				System.out.println(r);
				}
	
	}
}
}}