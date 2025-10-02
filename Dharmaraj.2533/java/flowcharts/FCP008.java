import java.util.*;
public class FCP008{
public static void main(String [] args){
Scanner ab = new Scanner(System.in);
int x=ab.nextInt();
int y=ab.nextInt();
x=x+y;
y=x-y;
x=x-y;
System.out.println(x);
System.out.println(y);
}}
