import java.util.*;
public class FCP042{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
long a=0;
long b=1;
long c=0;
if(N>=1)
	{
	System.out.println(a);
      }
if(N>=2)
     {
	System.out.println(b);
        }
for(int i=3;i<=N;i++)
	{
	 c=a+b;
	 a=b;
	 b=c;
	 System.out.println(c);
      }
  }
}