import java.util.*;
public class FCP021 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int e=sc.nextInt();
int f=sc.nextInt();
int g=sc.nextInt();
int h=sc.nextInt();
int m1=0;
int m2=0;
int m3=0;
int m4=0;
int m5=0;
int m6=0; 
int m7=0;
int m8=0;
if(a>b)
{
m1=a;
m2=b;
}
else
{
m1=b;
m2=a;
}
if(c>d){
m3=c;
m4=d;
}
else
{
m3=d;
m4=c;
}
if(e>f){
m5=e;
m6=f;
}
else
{
m5=f;
m6=e;
}
if(g>h) {
m7=g;
m8=h;
}else
{
m7=h;
m8=g;
}
int max1=0;
int max2=0;
int sec1=0;
int sec2=0;
if (m1 > m3) {
max1=m1;
sec1=m3;
} 
else
{
max1=m3;
sec1=m1;
}
if(m5>m7)
{
max2=m5;
sec2=m7;
}
else 
{
max2=m7;
sec2=m5;
}
int Max1=0;
int SecMax1=0;
if (max1>max2) {
Max1=max1;
if (max2>sec1) {
SecMax1=max2;
} 
else 
{
SecMax1=sec1;
}
}
else{
Max1=max2;
if
(max1>sec2) {
SecMax1=max1;
}
else{
SecMax1=sec2;
}
}
System.out.println(SecMax1);
}
}
