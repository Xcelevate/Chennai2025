import java.util.*;
public class FCP016{
public static void main(String [] args){
Scanner scan= new Scanner(System.in);
int a=scan.nextInt();
if(a%400==0){
System.out.println("YES");}
else if(a%100==0){
System.out.println("NO");}
else if(a%4==0){
System.out.println("YES");}
else{
System.out.println("NO");}
}
}