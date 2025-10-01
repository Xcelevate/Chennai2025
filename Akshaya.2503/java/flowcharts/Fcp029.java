import java.util.*;
public class Fcp029{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int a=0;
int sum=0;
while(num>0)
{
a=num%10;
num=num/10;
sum=sum+a;
}
System.out.println(sum);
}
}

