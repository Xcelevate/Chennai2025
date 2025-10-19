import java.util.*;
public class FCP021{
public static void main(String [] args){
Scanner ab = new Scanner(System.in);
int a = ab.nextInt();
int b = ab.nextInt();
int c = ab.nextInt();
int d = ab.nextInt();
int e = ab.nextInt();
int f = ab.nextInt();
int g = ab.nextInt();
int h = ab.nextInt();
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
}}
if (e>max1){
max2 = max1;
max1 = e;
}
else {
if (e>max2){
max2= e;
}}
if (f>max1){
max2 = max1;
max1 = f;
}
else {
if (f>max2){
max2= f;
}}
if (g>max1){
max2 = max1;
max1 = g;
}
else {
if (g>max2){
max2= g;
}}
if (h>max1){
max2 = max1;
max1 = h;
}
else {
if (h>max2){
max2= h;
}}
System.out.println(max2);
}
}



