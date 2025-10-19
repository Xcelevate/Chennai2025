import java.util.*;
public class FCP017{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int max1=0;
int min1=0;
if(a>b)
{
	max1=a;
	min1=b;
}
else
{
	max1=b;
	min1=a;
}
if(max1>c)
{
	if(min1>c)
	{
		System.out.println(min1);
	}
        else
        {
        	System.out.println(c);
	}
}
else 
{
	System.out.println(max1);
}
}}