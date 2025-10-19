import java.util.*;
public class FCP016{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int Y=input.nextInt();
if (Y%400==0){
System.out.println("YES");
}
else if (Y%100==0){
System.out.println("NO");
}
else if(Y%4==0){
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}
       