import java.util.*;
public class sm{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();
int e=s.nextInt();
int f=s.nextInt();
int g=s.nextInt();
int h=s.nextInt();

int max1=a;
int sec1=b;
if(sec1>max1)
{
int temp=max1;
max1=sec1;
sec1=temp;
}

int x=c;
if(x>max1)
{
sec1=max1;
max1=x;
}
else if(x>sec1)
{
sec1=x;
}

x=d;
if(x>max1)
{
sec1=max1;
max1=x;
}
else if(x>sec1)
{
sec1=x;
}

x=e;
if(x>max1)
{
sec1=max1;
max1=x;
}
else if(x>sec1)
{
sec1=x;
}

x=f;
if(x>max1)
{
sec1=max1;
max1=x;
}
else if(x>sec1)
{
sec1=x;
}

x=g;
if(x>max1)
{
sec1=max1;
max1=x;
}
else if(x>sec1)
{
sec1=x;
}

x=h;
if(x>max1)
{
sec1=max1;
max1=x;
}
else if(x>sec1)
{
sec1=x;
}

System.out.println(sec1);
}}
