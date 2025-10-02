import java.util.*;
public class FCP018{
public static void main(String [] args){
Scanner ab = new Scanner(System.in);
int a = ab.nextInt();
float b = 0;
float c = 0;
float d = 0;
if (a<=10000){
b = (float)0.2*a;
c = (float)0.8*a;
d = b + c + a;
System.out.println((int)d);
}
else{

if (a<=20000){
b = (float)0.25*a;
c = (float)0.9*a;
d = b + c + a;
System.out.println((int)d);
}
else{
b = (float)0.3*a;
c = (float)0.95*a;
d = b + c + a;
System.out.println((int)d);
}
}
}
}    









