import java.util.*;
public class FCP031{
public static void main(String [] args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int r=0;
int sum=0;
while(a>0){
r=a%10;
sum=(sum*10)+r;
a=a/10;}
System.out.println(sum);
}
}