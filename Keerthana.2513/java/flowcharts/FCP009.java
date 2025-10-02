import java.util.*;
public class FCP009{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int A=sc.nextInt();
int B=sc.nextInt();
int num=0;
num=A;
while(num%B!=0)
{
num--;
}
System.out.println(num);
}}




