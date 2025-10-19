import java.util.*;
public class FCP022{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
int n1=input.nextInt();
int n2=input.nextInt();
int n3=input.nextInt();
int n4=input.nextInt();
int n5=input.nextInt();
int c=1;
int c1=1;
int c2=1;
int c3=1;



if (n1==n2){
c=c+1;
}
if (n1==n3){
c=c+1;
}
if (n1==n4){
c=c+1;
}
if (n1==n5){
c=c+1;
}
System.out.println(n1+"="+c);
if(n1!=n2){

if (n2==n3){
c1=c1+1;
}
if (n2==n4){
c1=c1+1;
}
if (n2==n5){
c1=c1+1;
}
System.out.println(n2+"="+c1);
}
if(n1!=n2){
if(n2!=n3){
if (n3==n4){
c2=c2+1;
}
if (n3==n5){
c2=c2+1;
}
System.out.println(n3+"="+c2);
}
}
if(n1!=n4){
if(n2!=n4){
if(n3!=n4){
if(n4==n5){
c3=c3+1;
}
}
}
System.out.println(n4+"="+c3);
}
if(n1!=n4){
if(n2!=n4){
if(n3!=n4){
if(n4!=n5){
System.out.println(n5+"=1");
}
}
}
}
}
}








