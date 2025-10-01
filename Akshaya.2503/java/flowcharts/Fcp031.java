import java.util.*;
public class Fcp031{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int a;
int b=0;
while(num>0){
 a=num%10;
 b=b*10+a;
 num=num/10;
}
System.out.println(b);
}
}