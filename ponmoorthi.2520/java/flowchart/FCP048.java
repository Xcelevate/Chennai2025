import java.util.*;
public class FCP048
{
   public static void main(String[]args){
	Scanner sc=new Scanner(System.in);
	int m=sc.nextInt();
	int n=sc.nextInt();
	int s=0;
	int k=0;
	while(m<=n){
	int a=m;
	int v=m;
	int z=m;
	s=0;
	while(a!=0)
	{
	int b=a%10;
	s++;
	a=a/10;
	}
	k=0;
	while(v!=0)
	{
	int d=v%10;
	k=k+(int)Math.pow(d,s);
	v=v/10;
	}
	if(k==z){
	System.out.println(z);
	}
	m++;
	}
   }
}
