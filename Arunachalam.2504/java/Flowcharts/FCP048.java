import java.util.*;
public class FCP048{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int m=s.nextInt();
int n=s.nextInt();
int i=m;
while(i<=n){
int j=i;
int c=0;
while(j>0){
c=c+1;
j=j/10;}
int z=i;
int a=0;
while(z>0){
int d=z%10;
int p=1;
int k=1;
while(k<=c){
p=p*d;
k++;}
a=a+p;
z=z/10;}
if(a==i){
System.out.println(a);}
i++;}}}
