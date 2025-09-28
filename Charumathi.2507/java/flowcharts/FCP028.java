import java.util.*;
public class FCP028{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
if(N<10){
System.out.println(1);
return;
}
if(N<100){
System.out.println(2);
return;
}
if(N<1000){
System.out.println(3);
return;
}
if(N<10000){
System.out.println(4);
return;
}
if(N<100000){
System.out.println(5);
return;
}
if(N<1000000){
System.out.println(6);
return;
}
if(N<10000000){
System.out.println(7);
return;
}
}
}