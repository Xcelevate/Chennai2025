import java.util.*;
public class FCP020{
public static void main(String [] args){
Scanner ab = new Scanner(System.in);
int a = ab.nextInt();
int b = ab.nextInt();
int c = ab.nextInt();
int d = ab.nextInt();
int max1 = 0;
int max2 = 0;
if (a>b) {
max1 = a;
max2 = b;
}
else {
max1 = b;
max2 = a;
}
if(c>max1){
max2=max1;
max1=c;
}
else{
if(c>max2){
max2 = c;
}}
if (d>max1){
max2 = max1;
max1 = d;
}
else {
if (d>max2){
max2= d;
}
}
System.out.println(max2);
}
}
