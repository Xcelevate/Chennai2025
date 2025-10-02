import java.util.*;
public class FCP039{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=sc.nextInt();
int i=1;
int max=a;
int min=a;

while(i<n)
{
int m =sc.nextInt();
if(max<m)
{
max=m;
}
if(min>m)
{
min=m;
}
i++;
}
System.out.println(max);
System.out.println(min);
}}