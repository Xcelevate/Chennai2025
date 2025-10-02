import java.util.*;
public class FCP018{
public static void main(String a[]){
Scanner s= new Scanner(System.in);
int bs=s.nextInt();
double h,d;
double t;
if(bs<=10000){
h=bs*0.2;
d=bs*0.8;
t=bs+h+d;
}
else if(bs<=20000){
h=bs*0.25;
d=bs*0.9;
t=bs+h+d;
}
else{
h=bs*0.3;
d=bs*0.95;
t=bs+h+d;
}
System.out.println((int)t);
}}

