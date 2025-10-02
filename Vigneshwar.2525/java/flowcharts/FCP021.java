import java .util.*;
public class FCP021{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int a = in.nextInt();
int b = in.nextInt();
int c = in.nextInt();
int d = in.nextInt();
int e = in.nextInt();
int f = in.nextInt();
int g = in.nextInt();
int h = in.nextInt();

int max = 0;
int smax = 0;
if(a>b){
max = a;
smax = b;
}
else {
max=b;
smax=a;
}

if(c>max){
smax = max;
max = c;
}
else if(c>smax){
smax = c;
}
if(d>max){
smax = max;
max = d;
}
else if(d>smax) {
smax = d;
}
if(e>max){
smax = max;
max = e;
}
else if(e>smax) {
smax = e;
}
if(f>max){
smax = max;
max = f;
}
else if(f>smax) {
smax = f;
}
if(g>max){
smax = max;
max = g;
}
else if(g>smax) {
smax = g;
}
if(h>max){
smax = max;
max = h;
}
else if(h>smax) {
smax = h;
}
System.out.println(smax);
}
}


