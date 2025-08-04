import java.util.*;
public class FCP009{
public static void main (String [] args){
Scanner scan= new Scanner(System.in);
int a = scan.nextInt();
int b = scan.nextInt();
int c =0;
int d=a%b;
if(d==0){
c=a-b;
}
else{
c=a-d;}
System.out.println(c);
}
}