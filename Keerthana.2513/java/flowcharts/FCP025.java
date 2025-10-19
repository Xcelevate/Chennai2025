import java.util.*;
public class FCP025{
public static void main(String[]args){
Scanner sc =new Scanner(System.in);
int d=0;
int num=sc.nextInt();
for(int i=1;i<=num;i++)
{
if(i%2!=0)
{
d=d+i;
}
}
System.out.println(d);
}}