import java.util.*;
public class FCP051{
public static void main(String[]args){
Scanner ab = new Scanner(System.in);
int n =ab.nextInt();
int a =0;
int b =10;
while(b>9){
b=0;
while(n!=0){
a=n%10;
b=b+a;
n=n/10;
}
n=b;
}
System.out.println(b);
}
}

