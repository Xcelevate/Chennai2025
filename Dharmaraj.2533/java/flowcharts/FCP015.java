import java.util.*;
public class FCP015{
public static void main(String [] args){
Scanner ab = new Scanner(System.in);
int a = ab.nextInt();
int b = ab.nextInt();
int c = ab.nextInt();
int d = ab.nextInt();
int x = 0;
if (a>b){
 x = a;
}
else {
x = b;
}
if (x>c){
x = x;
}
else{
x = c;
}
if (x>d){
System.out.println(x);
}
else {
System.out.println(d);
}
}
}





