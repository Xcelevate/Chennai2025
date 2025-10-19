import java.util.*;
public class FCP020
{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();
int max=0;
int min=0;
if (a>b) 
{
  max=a;
  min=b;
 }
 else
 {
   max=b;
   min=a;
 }
if (c>max)
{
min=max;
max=c;
 } 
else if (c>min) 
{
 min=c;
}
if (d>max) 
{
min=max;
max=d;
} 
else if (d>min) 
{
 min=d;
}
 System.out.println(min);
 }
}
