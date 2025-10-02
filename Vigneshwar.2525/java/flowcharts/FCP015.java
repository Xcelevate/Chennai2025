import java .util.*;
public class FCP015{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int a = in.nextInt();
int b = in.nextInt();
int c = in.nextInt();
int d = in.nextInt();

if ( a>b && a>c && a>d ){
System.out.println(a);
}
else if ( b>c && b>d ){
System.out.println(b);
}
else if( c>d ) {
System.out.println(c);
}
else {
System.out.println(d);
}
}
}
