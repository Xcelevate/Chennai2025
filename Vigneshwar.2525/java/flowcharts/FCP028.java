import java .util.*;
public class FCP028{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int n = in.nextInt();
int a = 0;
int s = 0;

while(n==0){
a=n%10;
s=s+a;
n=n/10;

System.out.println(s);
}
}

