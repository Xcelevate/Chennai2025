import java.util.*;
public class FCP038{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int b=N;
int a=0;
int c=0;
while(N!=0){
a=N%10;
c=c+(a*a*a);
N=N/10;}
if(c==b){
System.out.println("Yes");}
else{
System.out.println("No");}
}}
