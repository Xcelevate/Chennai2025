import java.util.*;
public class Fcp036{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int temp=0;
while(b>0)
{
a=temp;
b=temp%b;
a=b;
}
int hcf=temp;
int lcm=a*b/hcf;
System.out.println(hcf);
System.out.println(lcm);
}
}
