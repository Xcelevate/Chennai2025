import java.util.Scanner;
public class FCP30{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
for (int i=1;i*i<=a;i++)
{
if(i*i==a){
System.out.println("yes");
return;
}
}
System.out.println("no");
}
}


