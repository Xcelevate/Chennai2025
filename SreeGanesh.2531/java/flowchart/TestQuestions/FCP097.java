import java.util.Scanner;
public class Triangle{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int a=scn.nextInt();
int b=scn.nextInt();
int c=scn.nextInt();
int l=0;
int x=0;
int y=0;
if(a>=b && a>=c){
l=a;
x=b;
y=c;
}
else if(b>=a && b>=c){
l=b;
x=a;
y=c;
}
else{
l=c;
x=a;
y=b;
}
int ch=x+y;
if(ch>l){
int d=l*l-(x*x + y*y); 
if(d==0){
System.out.println("Right");
}
else if(d>0){
System.out.println("Obtuse");
}
else{
System.out.println("Acute");
}
}
else{
System.out.println("Invalid");
}
}
}
import java.util.Scanner;
public class Triangle{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int a=scn.nextInt();
int b=scn.nextInt();
int c=scn.nextInt();
int l=0;
int x=0;
int y=0;
if(a>=b && a>=c){
l=a;
x=b;
y=c;
}
else if(b>=a && b>=c){
l=b;
x=a;
y=c;
}
else{
l=c;
x=a;
y=b;
}
int ch=x+y;
if(ch>l){
int d=l*l-(x*x + y*y); 
if(d==0){
System.out.println("Right");
}
else if(d>0){
System.out.println("Obtuse");
}
else{
System.out.println("Acute");
}
}
else{
System.out.println("Invalid");
}
}
}
