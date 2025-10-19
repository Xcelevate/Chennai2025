import java .util.*;
public class FCP018{
public static void main(String[]args){

Scanner in = new Scanner(System.in);

int n = in.nextInt();

int a = 0;
int b = 0;
int c = 0;

if(n<=10000){
a=(20*n)/100;
b=(80*n)/100;
c=a+b+n;
System.out.println(c);
}
else if(n<=20000){
a=(25*n)/100;
b=(90*n)/100;
c=a+b+n;
System.out.println(c);
}
else {
a=(30*n)/100;
b=(95*n)/100;
c=a+b+n;
System.out.println(c);
}
}
}


