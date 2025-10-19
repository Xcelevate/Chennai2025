import java.util.*;
public class FCP036{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int m=s.nextInt();
int n=s.nextInt();
int max,min;
int h=1;
int l;
if(m>n)
{
max=m;
min=n;
}
else{
max=n;
min=m;
}
int i=max;
while(i>0){
if(max%i==0){
if(min%i==0){
h=i;
break;
}}
i--;}
l=(max/h)*min;
System.out.println(h);
System.out.println(l);}}

