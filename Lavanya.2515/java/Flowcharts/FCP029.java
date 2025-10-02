import java.util.*;
public class FCP029{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int a=0;
int c=0;
while(N>0){
a=N%10;
c=c+a;
N=N/10;}
System.out.println(c);
}}