import java .util.*;
public class FCP031{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int n = in.nextInt();
int a=0;
int b=0;

while(n!=0){
a=n%10;
b=b*10+a;
n=n/10;
}
System.out.println(b);
}
}
